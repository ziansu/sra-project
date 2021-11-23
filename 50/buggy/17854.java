public void updateNotification(monakhv.samlib.db.entity.Author author) {
    if ((mProgressNotification) == null) {
        mProgressNotification = new monakhv.android.samlib.service.ProgressNotification(mSettingsHelper, "text");
    }
    mProgressNotification.update(author);
}