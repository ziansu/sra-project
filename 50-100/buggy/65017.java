private java.lang.Boolean DeleteUsers(java.sql.Connection conn, org.json.JSONArray userList) throws org.json.JSONException {
    org.json.JSONArray array = new org.json.JSONArray();
    for (int i = 0; i < (userList.length()); i++) {
        org.json.JSONObject object = ((org.json.JSONObject) (userList.get(i)));
        object.put("AliveUser", 0);
    }
    com.database.DBController.ExecuteMultipleUpdate(conn, "sys_conf_userinfo", array, "ID");
    return true;
}