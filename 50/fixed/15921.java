@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (saveHighScore) {
        userName = input.getText().toString();
        saveHighScore(userName);
        saveHighScore = false;
    }
    dialogIsDisplayed = false;
    startNewGame();
}