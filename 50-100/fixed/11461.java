public ru.semiot.platform.apigateway.utils.Credentials addUser(int id, java.lang.String login, java.lang.String password, java.lang.String role) {
    try {
        ru.semiot.platform.apigateway.utils.Credentials c = new ru.semiot.platform.apigateway.utils.Credentials(id, login, password, role);
        em.merge(c);
        return c;
    } catch (java.lang.Exception ex) {
        return null;
    }
}