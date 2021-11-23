private boolean credentialsMatch(java.lang.String username, java.lang.String password) {
    io.infectnet.server.service.admin.JwtAuthenticationServiceImpl.AdminCredentials credentials = io.infectnet.server.service.admin.JwtAuthenticationServiceImpl.AdminCredentials.fetchFromConfiguration();
    return (username.equals(credentials.getUsername())) && (password.equals(credentials.getPassword()));
}