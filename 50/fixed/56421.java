public static java.lang.String encrypt(java.lang.String password) {
    return models.PasswordUtils.encrypt(password, models.PasswordUtils.getRandomSalt());
}