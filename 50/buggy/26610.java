@java.lang.Override
protected void onStop() {
    if (playPressed) {
        clickPlayButton();
    }
    super.onStop();
}