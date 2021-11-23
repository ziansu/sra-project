private void saveState(boolean isChecked) {
    editor = sharedPref.edit();
    editor.putBoolean(RequestConstants.IS_CHECKED, isChecked);
    if (isChecked) {
        editor.putString(RequestConstants.WEB_SITE, edtContext.getText().toString());
    }
    editor.apply();
}