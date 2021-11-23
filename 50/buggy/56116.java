public static java.lang.String getNumber(java.lang.String secret) {
    java.util.Objects.requireNonNull(secret, ErrorMessage.SECRET.toString());
    return io.mangoo.utils.TwoFactorUtils.generateCurrentNumber(secret, java.lang.System.currentTimeMillis());
}