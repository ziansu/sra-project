@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    prefs.edit().putString(name, s.toString()).apply();
}