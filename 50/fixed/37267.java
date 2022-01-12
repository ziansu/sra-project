boolean isPasswordValid(java.lang.String password) {
    return (android.text.TextUtils.isEmpty(password)) || ((password.length()) < 8);
}