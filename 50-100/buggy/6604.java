public boolean syncData() throws eu.focusnet.app.exception.FocusMissingResourceException {
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