public java.util.ArrayList<com.box.androidsdk.content.models.BoxSharedLink.Access> getAllowedSharedLinkAccessLevels() {
    java.util.ArrayList<java.lang.String> accessStrList = getPropertyAsStringArray(com.box.androidsdk.content.models.BoxItem.FIELD_ALLOWED_SHARED_LINK_ACCESS_LEVELS);
    if (accessStrList == null) {
        return null;
    }
    java.util.ArrayList<com.box.androidsdk.content.models.BoxSharedLink.Access> accessList = new java.util.ArrayList<com.box.androidsdk.content.models.BoxSharedLink.Access>(accessStrList.size());
    for (java.lang.String str : accessStrList) {
        accessList.add(BoxSharedLink.Access.fromString(str));
    }
    return accessList;
}