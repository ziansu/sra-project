@java.lang.Override
public com.iouseph.model.User userParse(org.json.JSONObject json) {
    com.iouseph.model.User user = null;
    if (json != null) {
        user = new com.iouseph.model.User();
        user.setId(json.getString("id"));
        user.setPassword(json.getString("password"));
        user.setUsername(json.getString("username"));
    }
    return user;
}