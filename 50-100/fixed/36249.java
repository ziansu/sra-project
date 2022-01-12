public java.util.List<com.example.rodri.todo.alarm.Alarm> getAllAlarms() {
    java.util.List<com.example.rodri.todo.alarm.Alarm> alarms = new java.util.ArrayList<>();
    android.database.Cursor cursor = database.query(MySQLiteHelper.TABLE_ALARM, alarmColumns, null, null, null, null, null);
    cursor.moveToFirst();
    while (!(cursor.isAfterLast())) {
        com.example.rodri.todo.alarm.Alarm alarm = cursorToAlarm(cursor);
        alarms.add(alarm);
        cursor.moveToNext();
    } 
    cursor.close();
    return alarms;
}