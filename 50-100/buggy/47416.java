private server.JSONObject register_user(server.JSONObject data, server.Session session) {
    if ((data.has("name")) && (data.has("password"))) {
        server.User user = new server.User(session, data.getString("name"), data.getString("password"));
        server.SocketLogic.registered_users.add(user);
        return getJsonFrame(0, "Registrierung erfolgreich.", new server.JSONObject("register_user_response"));
    }else {
        throw new server.JSONException("Invalid JSON");
    }
}