public boolean clientAuthentication(com.cooksys.tweeter.embedded.Credentials credentials) {
    return (clientRepository.findByCredentialsAndDeleted(credentials, false)) != null;
}