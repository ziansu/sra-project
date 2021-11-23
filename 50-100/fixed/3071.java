void updateNotification(monakhv.samlib.service.AuthorUpdateProgress progress, java.lang.String title) {
    if ((mProgressNotification) == null) {
        mProgressNotification = new monakhv.android.samlib.service.ProgressNotification(mSettingsHelper, title);
    }
    mProgressNotification.updateProgress(progress.getTotal(), progress.getCurrent(), progress.getName());
}