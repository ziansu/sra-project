public void imageViewCol1Clicked(android.view.View v) {
    android.util.Log.d("---------", "clicked 1");
    ChangeColorOnUserClick(v);
    if ((soundStatus) == "1") {
        buttonSound.start();
    }
    if (CheckUserInput(0)) {
        playGame();
    }
}