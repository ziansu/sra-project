private boolean isGroupDirectlyInRole(int groupId, int userRoleId) throws com.stratelia.webactiv.organization.AdminPersistenceException {
    int[] ids = new int[]{ groupId , userRoleId };
    java.lang.Integer result = getInteger(com.stratelia.webactiv.organization.UserRoleTable.SELECT_COUNT_USERROLE_GROUP_REL, ids);
    com.stratelia.silverpeas.silvertrace.SilverTrace.debug("admin", "UserRoleTable.isGroupDirectlyInRole()", ((((("Le groupe d'ID " + groupId) + " et le role d'ID ") + userRoleId) + " ont un nb de lien = ") + result));
    return (result != null) && (result >= 1);
}