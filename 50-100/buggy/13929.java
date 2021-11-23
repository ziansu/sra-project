@java.lang.Override
protected void onResume() {
    super.onPause();
    if (!(announcement.isRead())) {
        announcement.setRead(org.threeten.bp.ZonedDateTime.now());
        android.os.AsyncTask.execute(() -> dao.update(announcement));
    }
}