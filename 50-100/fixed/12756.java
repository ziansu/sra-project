private void deleteGoogleEvent(java.lang.String googleId) throws java.io.IOException {
    w094j.ctrl8.database.GoogleStorage.logger.info(("Deleting Google Event: " + googleId));
    w094j.ctrl8.database.GoogleStorage.dataStoreEvent.delete(googleId);
    try {
        this.clientCalendar.events().delete(this.googleCalendar.getId(), googleId).execute();
    } catch (java.io.IOException e) {
        w094j.ctrl8.database.GoogleStorage.logger.info(("Fail to delete Google Event: " + googleId));
    }
}