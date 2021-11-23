public boolean validatePassword(com.nimbits.client.model.user.User user, java.lang.String password) {
    java.lang.String storedEncodedPassword = user.getPassword();
    java.lang.String salt = user.getPasswordSalt();
    java.lang.String challenge = org.apache.commons.codec.digest.DigestUtils.sha512Hex((password + salt));
    return (!(org.apache.commons.lang3.StringUtils.isEmpty(password))) && (storedEncodedPassword.equals(challenge));
}