public void insertSchedule(com.gaoshuhang.weatherandschedule.domain.Schedule schedule) {
    android.database.sqlite.SQLiteDatabase db = com.gaoshuhang.weatherandschedule.dao.ScheduleDao.helper.getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put("content", schedule.getContent());
    if ((schedule.getAlarmDate()) == null) {
        contentValues.put("alarm_date", 0);
    }else {
        contentValues.put("alarm_date", schedule.getAlarmDate().getTime());
    }
    db.insert("t_schedule", null, contentValues);
}