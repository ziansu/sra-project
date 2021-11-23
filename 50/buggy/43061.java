private java.lang.Void sendTextCommandAndUpdate(java.lang.String foo) {
    updateDisplay(sendCommandToMapWithText(Key_Commands.STANDING_STILL, foo));
    return null;
}