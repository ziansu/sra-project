@java.lang.Override
public void addTags(edu.unc.lib.dl.search.solr.model.BriefObjectMetadata record, edu.unc.lib.dl.acl.util.AccessGroupSet accessGroups) {
    if (record.getContentStatus().contains(FacetConstants.CONTENT_IS_DEFAULT_OBJECT)) {
        edu.unc.lib.dl.search.solr.model.Tag tag = new edu.unc.lib.dl.search.solr.model.Tag("primary object");
        record.addTag(tag);
    }
}