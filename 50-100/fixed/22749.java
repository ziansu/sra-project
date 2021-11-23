public void onClick(android.content.DialogInterface dialog, int whichButton) {
    java.lang.String value = input.getText().toString();
    checkInputDialog(key, true, value);
    if (!(android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean("use_hardware_keyboard", false))) {
        ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE))).hideSoftInputFromWindow(input.getWindowToken(), 0);
    }
}