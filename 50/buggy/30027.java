public void dispose() {
    running = false;
    vecManager.dispose();
    vecManager = null;
    renderWrapper = null;
}