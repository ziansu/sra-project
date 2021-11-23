public boolean isComponentManageable(java.lang.String componentId, java.lang.String userId) throws com.stratelia.webactiv.beans.admin.AdminException {
    boolean manageable = getUserDetail(userId).isAccessAdmin();
    if (!manageable) {
        java.util.List<java.lang.String> toCheck = java.util.Arrays.asList(getUserManageableSpaceIds(userId));
        java.util.List<com.stratelia.webactiv.beans.admin.SpaceInstLight> path = getPathToComponent(componentId);
        for (com.stratelia.webactiv.beans.admin.SpaceInstLight space : path) {
            if (toCheck.contains(space.getShortId())) {
                return true;
            }
        }
    }
    return false;
}