public boolean isUserDirectlyInRole(int userId, int userRoleId) throws com.stratelia.webactiv.organization.AdminPersistenceException {
    int[] ids = new int[]{ userId , userRoleId };
    java.lang.Integer result = getInteger(com.stratelia.webactiv.organization.UserRoleTable.SELECT_COUNT_USERROLE_USER_REL, ids);
    return (result != null) && (result >= 1);
}