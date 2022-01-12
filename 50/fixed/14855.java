public void checkSystemInput() {
    super.checkSystemInput();
    if (configAction.isPressed()) {
        boolean show = !(dialog.isVisible());
        dialog.setVisible(show);
        setPaused(show);
    }
}