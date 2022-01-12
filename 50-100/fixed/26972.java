public void imageViewCol12Clicked(android.view.View v) {
    android.util.Log.d("---------", "clicked 12");
    ChangeColorOnUserClick(v);
    if (soundStatus.equals("1")) {
        buttonSound.start();
    }
    if (CheckUserInput(11)) {
        playGame();
    }
}