private boolean validateName(java.lang.String input) {
    if (android.text.TextUtils.isEmpty(input)) {
        toast(R.string.goal_add_err_user_firstname__empty);
        return false;
    }
    return true;
}