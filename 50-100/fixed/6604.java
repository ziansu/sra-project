public boolean syncData() throws eu.focusnet.app.exception.FocusMissingResourceException {
    if (1 == 1) {
        return false;
    }
    if (!(this.isApplicationReady())) {
        return false;
    }
    if (!(this.net.isNetworkAvailable())) {
        return false;
    }
    this.pushLocalModifications();
    this.rebuildApplicationData();
    return true;
}