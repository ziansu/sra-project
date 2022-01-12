@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (saveHighScore) {
        userName = input.getText().toString();
        saveHighScore(userName);
    }
    dialogIsDisplayed = false;
    stopGame();
    android.content.Intent myIntent = new android.content.Intent(getContext(), edu.augustana.csc490.picnicwars.SplashActivity.class);
    startActivityForResult(myIntent, 0);
}