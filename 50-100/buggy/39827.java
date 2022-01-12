@pt.ist.fenixframework.Atomic
public void delete() {
    for (org.fenixedu.cms.domain.component.Component c : this.getComponentsSet()) {
        c.delete();
    }
    this.setCreatedBy(null);
    this.setSite(null);
    for (org.fenixedu.cms.domain.Post post : this.getPostsSet()) {
        for (org.fenixedu.cms.domain.Category c : com.google.common.collect.Sets.newHashSet(post.getCategoriesSet())) {
            post.removeCategories(c);
        }
    }
    this.deleteDomainObject();
}