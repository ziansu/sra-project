public boolean handleBackButton() {
    boolean exit = ((parentNode) == null) || (parentNode.isEmpty());
    if (!exit) {
        depthChangeListener.handleDepthChange(false);
    }
    return exit;
}