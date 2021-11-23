public void setNotificationsTagsIDs(java.util.ArrayList<java.lang.String> tagsIDs) {
    remove(Const.COL_NAME_NOTIFICATIONS_TAGS);
    addAllUnique(Const.COL_NAME_NOTIFICATIONS_TAGS, tagsIDs);
}