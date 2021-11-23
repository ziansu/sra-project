public java.util.List<com.pretizy.activitytracker.model.Schedule> findAllSchedules() {
    android.database.Cursor cursor = findAll();
    cursor.moveToFirst();
    java.util.List<com.pretizy.activitytracker.model.Schedule> schedules = new java.util.ArrayList<>();
    while (cursor.moveToNext()) {
        com.pretizy.activitytracker.model.Schedule schedule = cursorToSchedule(cursor);
        schedules.add(schedule);
        schedule.setId(cursor.getLong(cursor.getColumnIndexOrThrow(BaseColumns._ID)));
    } 
    return schedules;
}