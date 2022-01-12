public static final boolean isLoginCorrect(final java.lang.String username, final java.lang.String token) {
    if ((username == null) || (token == null)) {
        return false;
    }
    return (username.equals(org.dannil.quizgamebackend.utility.CredentialsUtility.USERNAME)) || (token.equals(org.dannil.quizgamebackend.utility.CredentialsUtility.TOKEN));
}