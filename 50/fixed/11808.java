private void holdButtonEndTouch(android.view.View view) {
    if ((buttonPressCountDown) != null) {
        buttonPressCountDown.cancel();
    }
    if ((currentTeamCapture) == 0) {
        blockButton(0);
    }
}