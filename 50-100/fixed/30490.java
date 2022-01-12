private concentric.medalarm.models.Alarm cursorToAlarm(android.database.Cursor cursor) {
    concentric.medalarm.models.Alarm alarm = new concentric.medalarm.models.Alarm();
    alarm.setId(cursor.getLong(cursor.getColumnIndex(Alarm.COLUMN_NAME_ALARM_ID)));
    alarm.setGroupID(cursor.getLong(cursor.getColumnIndex(Alarm.COLUMN_NAME_ALARM_GROUP)));
    alarm.setHour(cursor.getInt(cursor.getColumnIndex(Alarm.COLUMN_NAME_ALARM_TIME_HOUR)));
    alarm.setMinute(cursor.getInt(cursor.getColumnIndex(Alarm.COLUMN_NAME_ALARM_TIME_MINUTE)));
    return alarm;
}