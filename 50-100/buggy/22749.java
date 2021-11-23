public void onClick(android.content.DialogInterface dialog, int whichButton) {
    checkInputDialog(key, false, "");
    if (!(android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean("use_hardware_keyboard", false))) {
        ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE))).hideSoftInputFromWindow(input.getWindowToken(), 0);
    }
}