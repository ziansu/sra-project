public boolean create_reminder(android.content.Context context, com.nego.flite.database.DbAdapter dbHelper) {
    this.id = ((int) (dbHelper.createReminder(this)));
    if ((id) > 0) {
        com.nego.flite.Functions.AlarmF.addAlarm(context, this.getId(), this.getAlarm(), this.getAlarm_repeat());
        return true;
    }
    return false;
}