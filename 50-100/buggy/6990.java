public static void activeClock(int id) {
    mine.android.api.modules.ClockEntry clockEntry = mine.android.api.ClockEntryAPI.getById(id);
    if (!(clockEntry.isActive())) {
        clockEntry.setActive(true);
        mine.android.api.ClockEntryAPI.updateClockEntry(clockEntry);
    }
    java.util.Calendar nextAlarmTime = mine.android.api.AlarmAPI.getNextAlarmTime(clockEntry);
    android.util.Log.i(("next alarm time for id: " + id), nextAlarmTime.getTime().toString());
    mine.android.api.AlarmAPI.setTimer(id, nextAlarmTime);
}