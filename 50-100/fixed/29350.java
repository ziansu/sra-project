public static com.pratilipi.data.client.TagData createTagData(com.pratilipi.data.type.Tag tag, java.lang.Boolean addMeta) {
    if (tag == null)
        return null;
    
    com.pratilipi.data.client.TagData tagData = new com.pratilipi.data.client.TagData();
    tagData.setCategoryId(tag.getId());
    tagData.setCategoryName(tag.getName());
    tagData.setCategoryNameEn(tag.getNameEn());
    if (addMeta) {
        tagData.setLanguage(tag.getLanguage());
        tagData.setPratilipiType(tag.getType());
    }
    return tagData;
}