private void sendSpace() {
    sendKeyChar(((char) (KeyCodes.SPACE)));
    updateShiftKeyState(getCurrentInputEditorInfo());
}