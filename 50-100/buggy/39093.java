private void onSuccessfulSync() {
    org.commcare.tasks.DataPullTask.recordSuccessfulSyncTime();
    android.content.Intent i = new android.content.Intent("org.commcare.dalvik.api.action.data.update");
    this.context.sendBroadcast(i);
    if (loginNeeded) {
        org.commcare.CommCareApplication.instance().getAppStorage(org.commcare.android.database.app.models.UserKeyRecord.class).write(ukrForLogin);
    }
    org.javarosa.core.services.Logger.log(AndroidLogger.TYPE_USER, ("User Sync Successful|" + (username)));
    updateCurrentUser(password);
    this.publishProgress(org.commcare.tasks.DataPullTask.PROGRESS_DONE);
}