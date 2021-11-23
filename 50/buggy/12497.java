private void showDispenseButton() {
    checkForCompletion();
    dispenseButton.animate().alpha(1).setDuration(com.zombietank.bender.MainActivity.BUTTON_FADE_TIME_MILLIS).start();
}