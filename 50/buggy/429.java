public java.util.List<database.TagItem> getParentTags(java.lang.String child) {
    java.util.List<java.lang.String> childList = new java.util.ArrayList<java.lang.String>();
    childList.add(child);
    java.util.List<database.TagItem> parentTags = getParentTags(child);
    return parentTags;
}