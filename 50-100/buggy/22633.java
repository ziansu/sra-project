private java.util.ArrayList<java.lang.String> getApplicationUsers(java.lang.String defaultAppKey) throws java.lang.Exception {
    org.json.JSONArray users = userMgtClient.getUsersOfApplication(defaultAppKey);
    java.util.ArrayList<java.lang.String> returnedUsers = new java.util.ArrayList<java.lang.String>();
    for (int i = 0; i < (users.length()); i++) {
        returnedUsers.add(users.getJSONObject(i).getString(org.wso2.appfactory.tests.scenarios.tenantadmin.UserManagementTestCase.JS_OBJECT_KEY_USER_NAME));
    }
    return returnedUsers;
}