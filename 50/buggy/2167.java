@java.lang.Override
public void onClick(android.view.View v) {
    alarms.remove(position);
    me.vucko.calendarapp.alarm.database.Database.init(context);
    me.vucko.calendarapp.alarm.database.Database.deleteEntry(alarms.get(position));
    callAlarmScheduleService();
    notifyDataSetChanged();
}