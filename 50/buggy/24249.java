public void checkProgramFocus() {
    boolean top = rootWindow.thisOrChildrenFocused();
    rootWindow.setAlwaysOnTop(top);
    if (!top) {
        rootWindow.toBack();
    }
}