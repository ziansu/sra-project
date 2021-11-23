public void clearButtonClick() {
    infoFragment.enableClearButton(false);
    localDatabase.clearLocalDatabase();
    infoFragment.enableSyncButton(true);
}