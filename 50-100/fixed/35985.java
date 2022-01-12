public boolean delete_reminder(android.content.Context context, com.nego.flite.database.DbAdapter dbHelper) {
    if (dbHelper.deleteReminder(("" + (this.getId())))) {
        com.nego.flite.Functions.AlarmF.deleteAlarm(context, this.getId());
        return true;
    }
    return false;
}