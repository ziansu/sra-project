@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        android.content.SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(getString(R.string.user), userTextField.getText().toString().toLowerCase());
        editor.apply();
        xyz.lapig.iceberg.Globals.setUser(userTextField.getText().toString().toLowerCase());
    }else {
    }
}