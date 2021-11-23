public void twoFunctionButtonPress(android.view.View view) {
    setSingleButton();
    if (((confirmedDirections) == true) && ((currentLatitude) != 0.0)) {
        done = false;
        forwardSuccessful = false;
        stoppedSuccessful = false;
        upwardSuccessful = false;
        cheersText.setTextSize(20);
        cheersText.setText(("Instructions: \n\n" + ("At the same time, thrust your phones forward, bump knuckles, and up toward the sky!\n\n" + "Push the button when ready!")));
        cheersTwoPurposeButton.setText("Restart");
        confirmedDirections = false;
    }else {
        confirmedDirections = true;
        cheersTwoPurposeButton.setText("Restart");
    }
}