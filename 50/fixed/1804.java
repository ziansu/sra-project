public void dispose() {
    toolbarManager.removeAll();
    if (doOnce) {
        compareConfiguration.getEventBus().unregister(this);
    }
    this.doOnce = false;
}