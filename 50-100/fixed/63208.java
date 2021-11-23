private void setCurrentGroupId(java.lang.String groupId) {
    if (((currentGroupId) != null) && (!(currentGroupId.equals(groupId)))) {
        resetCurrentGroup();
    }
    currentGroupId = groupId;
    if ((currentGroupId) != null) {
        resetCurrentUser();
    }
}