@java.lang.Override
public void createTag(org.searchisko.persistence.jpa.model.Tag tag) {
    java.util.List<org.searchisko.persistence.jpa.model.Tag> tagList = getTagsByContent(tag.getContentId());
    if (tagList.contains(tag)) {
        return ;
    }
    tag.setCreatedAt(new java.sql.Timestamp(java.lang.System.currentTimeMillis()));
    em.persist(tag);
}