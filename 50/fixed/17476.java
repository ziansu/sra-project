private boolean credentialsMatch(java.lang.String username, java.lang.String password) {
    io.infectnet.server.service.admin.JwtAuthenticationServiceImpl.AdminCredentials credentials = io.infectnet.server.service.admin.JwtAuthenticationServiceImpl.AdminCredentials.fetchFromConfiguration();
    return (credentials.getUsername().equals(username)) && (credentials.getPassword().equals(password));
}