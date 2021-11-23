private void holdButtonEndTouch(android.view.View view) {
    if ((buttonPressCountDown) != null) {
        buttonPressCountDown.cancel();
    }
    blockButton(currentTeamCapture);
}