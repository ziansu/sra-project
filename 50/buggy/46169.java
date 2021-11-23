private boolean init() {
    isEnabled();
    this.settings = settingsSupplier.get();
    return true;
}