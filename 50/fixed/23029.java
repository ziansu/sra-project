private void setSwitchButtonText() {
    switchButton.setText((usingRelativeGraph ? "Fixed" : "Relative"));
    switchButton.repaint();
}