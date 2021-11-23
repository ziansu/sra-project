public static boolean isEmailValid(java.lang.String email) {
    return (!(android.text.TextUtils.isEmpty(email))) && (Patterns.EMAIL_ADDRESS.matcher(email).matches());
}