public static synchronized boolean deleteClockEntry(int id) {
    int entryId = mine.android.api.ClockEntryAPI.findById(id);
    if (entryId == (-1))
        return false;
    
    mine.android.api.AlarmAPI.cancelClock(id);
    mine.android.api.ClockEntryAPI.list.remove(entryId);
    mine.android.api.ClockEntryAPI.save();
    return true;
}