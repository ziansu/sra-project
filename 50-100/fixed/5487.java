public void imageViewCol2Clicked(android.view.View v) {
    android.util.Log.d("---------", "clicked 2");
    ChangeColorOnUserClick(v);
    if (soundStatus.equals("1")) {
        buttonSound.start();
    }
    if (CheckUserInput(1)) {
        playGame();
    }
}