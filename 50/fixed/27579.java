private void toggleAbsolute() {
    toggleMode = (toggleMode) + 1;
    if ((toggleMode) >= (modeInput)) {
        toggleMode = 0;
    }
    if ((toggleMode) < 0) {
        toggleMode = modeInput;
    }
}