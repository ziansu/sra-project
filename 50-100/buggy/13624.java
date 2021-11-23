@java.lang.Override
public void onClick(android.view.View v) {
    android.content.SharedPreferences.Editor editor = prefs.edit();
    java.lang.String playerOneName = player1.getText().toString();
    java.lang.String playerTwoName = player2.getText().toString();
    editor.putString("playerOneName", playerOneName).apply();
    editor.putString("playerTwoName", playerTwoName).apply();
    dialog.dismiss();
}