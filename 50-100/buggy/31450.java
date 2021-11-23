@java.lang.Override
public boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
    android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
    editor.putString(getString(R.string.saved_forwarding_number), forwardNumber.getText().toString());
    editor.apply();
    return false;
}