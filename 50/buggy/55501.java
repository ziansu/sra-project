@java.lang.Override
protected java.util.List<com.wantcallback.model.ReminderInfo> doInBackground(java.lang.Void... params) {
    return remindersList = reminderDao.getAll();
}