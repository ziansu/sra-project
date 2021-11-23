public static com.dealren.web.model.User login(java.lang.String email, java.lang.String password) {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    map.put("email", email);
    map.put("password", password);
    com.dealren.web.service.UserService.log.info(map);
    try {
        org.json.JSONObject o = com.dealren.web.Service.request("login", map);
        return com.dealren.web.util.RespUtil.parseUser(o);
    } catch (com.mashape.unirest.http.exceptions.UnirestException e) {
        com.dealren.web.service.UserService.log.error(e.getMessage());
        return null;
    }
}