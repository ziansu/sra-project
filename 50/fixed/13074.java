void showMainFrame() {
    _mainFrame.pack();
    IceGridGUI.Utils.restoreWindowBounds(_mainFrame, _prefs, "Window", null);
    _mainFrame.setVisible(true);
}