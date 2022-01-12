public boolean delete_reminder(android.content.Context context, com.nego.flite.database.DbAdapter dbHelper) {
    com.nego.flite.Functions.AlarmF.deleteAlarm(context, this.getId());
    if (dbHelper.deleteReminder(("" + (this.getId())))) {
        return true;
    }
    return false;
}