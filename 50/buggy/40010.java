protected final int keepNumberOnly(final java.lang.String password2) {
    return java.lang.Integer.valueOf(password2.replaceAll("\\D+", ""));
}