public java.lang.String getToken(cc.blynk.server.model.auth.User user, java.lang.Integer dashboardId) {
    java.util.Map<java.lang.Integer, java.lang.String> dashTokens = user.getDashTokens();
    java.lang.String token = dashTokens.get(dashboardId);
    if (token == null) {
        cc.blynk.server.dao.UserRegistry.log.info("Token for user {} and dashId {} not generated yet.", user.getName(), dashboardId);
        refreshToken(user, dashboardId);
    }else {
        cc.blynk.server.dao.UserRegistry.log.info("Token for user {} and dashId {} generated already. Token {}", user.getName(), dashboardId, token);
    }
    return token;
}