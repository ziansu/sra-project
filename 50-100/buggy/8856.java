@java.lang.Override
protected java.lang.Integer doInBackground(java.lang.Void... voids) {
    publishProgress(R.string.file_migration_preparing);
    com.owncloud.android.lib.common.utils.Log_OC.stopLogging();
    boolean[] syncStates = new boolean[0];
    try {
        publishProgress(R.string.file_migration_saving_accounts_configuration);
        syncStates = saveAccountsSyncStatus();
        publishProgress(R.string.file_migration_waiting_for_unfinished_sync);
        stopAccountsSyncing();
        waitForUnfinishedSynchronizations();
    } finally {
        publishProgress(R.string.file_migration_restoring_accounts_configuration);
        restoreAccountsSyncStatus(syncStates);
    }
    com.owncloud.android.lib.common.utils.Log_OC.startLogging(mStorageTarget);
    return 0;
}