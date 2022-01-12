public void onUpgradeViews(@javax.annotation.Nonnull
org.dbtools.android.domain.AndroidDatabase androidDatabase, int oldVersion, int newVersion) {
    android.util.Log.i(org.dbtools.android.domain.AndroidDatabaseBaseManager.TAG, ((((("Upgrading database VIEWS [" + (androidDatabase.getName())) + "] from version ") + oldVersion) + " to ") + newVersion));
    if (oldVersion != newVersion) {
        onDropViews(androidDatabase);
        onCreateViews(androidDatabase);
    }
}