public static com.google.common.base.Optional<com.peter.util.db.Credentials> validateCredentials(com.google.common.base.Optional<com.peter.util.db.Credentials> credentials) {
    com.google.common.base.Optional<com.peter.util.db.Credentials> credentialsAbsent = com.google.common.base.Optional.absent();
    if (credentials.isPresent()) {
        if (((credentials.get().userName.length()) == 0) || ((credentials.get().password.length()) == 0))
            credentials = credentialsAbsent;
        
    }
    return credentials;
}