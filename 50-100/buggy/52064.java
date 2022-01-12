public void onClick(android.content.DialogInterface dialog, int whichButton) {
    android.text.Editable name = input.getText();
    IncreaseArraySize();
    MainScreen.highScoreArray[((MainScreen.highScoreArray.length) - 1)] = java.lang.String.valueOf(name);
    IncreaseArraySize();
    MainScreen.highScoreArray[((MainScreen.highScoreArray.length) - 1)] = java.lang.String.valueOf(score);
    WriteHighscoreFile();
    android.util.Log.d("Error ekk yako1o", "ane manda1");
    finish();
}