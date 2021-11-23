public void imageViewCol2Clicked(android.view.View v) {
    android.util.Log.d("---------", "clicked 2");
    ChangeColorOnUserClick(v);
    if ((soundStatus) == "1") {
        buttonSound.start();
    }
    if (CheckUserInput(1)) {
        playGame();
    }
}