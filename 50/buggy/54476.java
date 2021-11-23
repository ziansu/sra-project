public boolean shouldRespondWithGeolocation(com.medziku.motoresponder.logic.RespondingSubject subject) {
    if ((this.settings.isRespondingWithGeolocationEnabled()) == false) {
        return false;
    }
    if (this.settings.isRespondingWithGeolocationAlwaysEnabled()) {
        return true;
    }
    return false;
}