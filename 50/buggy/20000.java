public static final boolean isValidEmail(java.lang.CharSequence target) {
    if (target == null) {
        return false;
    }else {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}