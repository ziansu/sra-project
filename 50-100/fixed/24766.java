@java.lang.Override
public boolean createTag(org.searchisko.persistence.jpa.model.Tag tag) {
    java.util.List<org.searchisko.persistence.jpa.model.Tag> tagList = getTagsByContent(tag.getContentId());
    if (tagList.contains(tag)) {
        return false;
    }
    tag.setCreatedAt(new java.sql.Timestamp(java.lang.System.currentTimeMillis()));
    em.persist(tag);
    return true;
}