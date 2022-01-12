public void updateNotification(monakhv.samlib.service.AuthorUpdateProgress progress) {
    if ((mProgressNotification) == null) {
        mProgressNotification = new monakhv.android.samlib.service.ProgressNotification(mSettingsHelper, "text");
    }
    mProgressNotification.updateProgress(progress.getTotal(), progress.getCurrent(), progress.getName());
}