private void toggle(boolean state) {
    timber.log.Timber.i("Sync: %s", (state ? "enable" : "disable"));
    android.content.ContentResolver.setMasterSyncAutomatically(state);
}