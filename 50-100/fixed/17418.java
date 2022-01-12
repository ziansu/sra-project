public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String password = input.getText().toString();
    final android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putString(passwordType, password);
    editor.commit();
    android.widget.Toast.makeText(input.getContext(), "Saved", Toast.LENGTH_LONG).show();
}