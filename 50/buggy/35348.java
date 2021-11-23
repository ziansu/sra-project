private boolean isClosed() {
    return ((acr.browser.lightning.database.HistoryDatabase.mDatabase) == null) || (!(acr.browser.lightning.database.HistoryDatabase.mDatabase.isOpen()));
}