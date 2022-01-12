private void GameOver() {
    if ((optionResult) != null) {
        if ((dieCounter) < 1) {
            dbHandler.AddUser(optionResult[0], java.lang.String.valueOf(score), java.lang.String.valueOf(s));
            dieCounter = 1;
        }
    }else
        android.widget.Toast.makeText(getBaseContext(), "Please add your name in the Options menu!", Toast.LENGTH_SHORT).show();
    
    finish();
}