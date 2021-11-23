@java.lang.Override
public com.google.common.base.Optional<com.spotify.helios.auth.HeliosUser> authenticate(io.dropwizard.auth.basic.BasicCredentials credentials) throws io.dropwizard.auth.AuthenticationException {
    final java.lang.String username = credentials.getUsername();
    final java.lang.String password = credentials.getPassword();
    if ((users.containsKey(username)) && (users.get(username).equals(password))) {
        return com.google.common.base.Optional.of(new com.spotify.helios.auth.HeliosUser(username));
    }
    return com.google.common.base.Optional.absent();
}