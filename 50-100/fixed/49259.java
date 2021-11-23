public void writeHistory() {
    android.content.SharedPreferences.Editor editor = preferences.edit();
    editor.putString(com.dedis.epfl.cisc.MainActivity.HOST_KEY, mHostTextfield.getText().toString());
    editor.putString(com.dedis.epfl.cisc.MainActivity.PORT_KEY, mPortTextfield.getText().toString());
    editor.commit();
}