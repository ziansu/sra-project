public java.lang.String removeComponent(java.lang.String userId, java.lang.String componentId) throws com.stratelia.webactiv.beans.admin.AdminException {
    com.stratelia.webactiv.beans.admin.SpaceInst space = getPersonalSpace(userId);
    if (space != null) {
        com.stratelia.webactiv.beans.admin.ComponentInst component = getComponent(space, componentId);
        if (component != null) {
            com.stratelia.webactiv.beans.admin.AdminReference.getAdminService().deleteComponentInst(userId, componentId, true);
            return component.getName();
        }
    }
    return null;
}