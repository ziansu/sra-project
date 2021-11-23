public static java.lang.String generateCurrentNumber(java.lang.String secret) {
    java.util.Objects.requireNonNull(secret, ErrorMessage.SECRET.toString());
    return io.mangoo.utils.TwoFactorUtils.generateCurrentNumber(secret, java.lang.System.currentTimeMillis());
}