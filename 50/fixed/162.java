public void set(double value) {
    position = limit(value);
    if (frctest.EmulatorMain.enableGUI) {
        posLabel.setText(("Position: " + (position)));
    }
}