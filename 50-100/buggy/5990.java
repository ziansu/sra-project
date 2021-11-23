public void moveComponentInst(com.stratelia.webactiv.beans.admin.DomainDriverManager ddManager, int spaceLocalId, int componentLocalId) throws com.stratelia.webactiv.beans.admin.AdminException {
    try {
        com.stratelia.webactiv.beans.admin.ComponentInst componentInst = getComponentInst(ddManager, componentLocalId, spaceLocalId);
        ddManager.getOrganization().instance.moveComponentInstance(spaceLocalId, componentLocalId);
        notifier.notifyEventOn(org.silverpeas.notification.ResourceEvent.Type.DELETION, componentInst);
    } catch (java.lang.Exception e) {
        throw new com.stratelia.webactiv.beans.admin.AdminException("ComponentInstManager.moveComponentInst", org.silverpeas.util.exception.SilverpeasException.ERROR, "admin.EX_ERR_UPDATE_COMPONENT", ((("spaceId= " + spaceLocalId) + " componentId=") + componentLocalId), e);
    }
}