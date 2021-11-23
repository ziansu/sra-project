public boolean create_reminder(android.content.Context context, com.nego.flite.database.DbAdapter dbHelper) {
    com.nego.flite.Functions.AlarmF.addAlarm(context, this.getId(), this.getAlarm(), this.getAlarm_repeat());
    if ((dbHelper.createReminder(this)) > 0) {
        return true;
    }
    return false;
}