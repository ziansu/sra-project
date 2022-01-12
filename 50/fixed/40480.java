public static boolean isEmailValid(java.lang.String email) {
    email = email.trim();
    return (!(android.text.TextUtils.isEmpty(email))) && (Patterns.EMAIL_ADDRESS.matcher(email).matches());
}