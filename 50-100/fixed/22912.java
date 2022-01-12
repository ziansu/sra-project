private entities.Account createAccount(javax.servlet.http.HttpServletRequest request) throws java.sql.SQLException {
    java.lang.String email = request.getParameter("email");
    java.lang.String password = request.getParameter("password");
    return new entities.Account.Builder().setEmail(email).setPassword(password).setRole(User.Role.ROLE_USER.name()).build();
}