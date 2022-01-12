private boolean init() {
    if (!(isEnabled())) {
        return false;
    }
    this.settings = settingsSupplier.get();
    return true;
}