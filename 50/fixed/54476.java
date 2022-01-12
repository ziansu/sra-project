public boolean shouldRespondWithGeolocation() {
    if ((this.settings.isRespondingWithGeolocationEnabled()) == false) {
        return false;
    }
    if (this.settings.isRespondingWithGeolocationAlwaysEnabled()) {
        return true;
    }
    return false;
}