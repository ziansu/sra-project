public com.example.rodri.todo.alarm.Alarm cursorToAlarm(android.database.Cursor cursor) {
    com.example.rodri.todo.alarm.Alarm alarm = new com.example.rodri.todo.alarm.Alarm();
    alarm.setId(cursor.getLong(0));
    alarm.setDate(cursor.getString(1));
    alarm.setAlarmTime(cursor.getString(2));
    alarm.setTaskId(cursor.getLong(3));
    return alarm;
}