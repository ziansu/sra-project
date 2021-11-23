private void commit(android.content.ContentProviderClient usersProvider, android.content.SyncResult syncResult) {
    android.net.Uri uri = Users.CONTENT_URI.buildUpon().appendQueryParameter(Users.RESYNC, "true").appendQueryParameter(Users.COMMIT, "true").build();
    try {
        usersProvider.update(uri, null, null, null);
        android.util.Log.d(org.kontalk.sync.Syncer.TAG, "users database committed");
        org.kontalk.data.Contact.invalidate();
    } catch (android.os.RemoteException e) {
        android.util.Log.e(org.kontalk.sync.Syncer.TAG, "error committing users database - aborting sync", e);
        syncResult.databaseError = true;
    }
}