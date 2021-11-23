public static java.lang.String encrypt(java.lang.String password) {
    java.lang.String salt = models.PasswordUtils.getRandomSalt();
    return salt + (models.PasswordUtils.hash(password, salt));
}