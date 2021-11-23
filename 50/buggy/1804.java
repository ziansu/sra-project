public void dispose() {
    toolbarManager.removeAll();
    compareConfiguration.getEventBus().unregister(this);
    this.doOnce = false;
}