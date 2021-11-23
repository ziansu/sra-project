public static synchronized boolean updateClockEntry(mine.android.api.modules.ClockEntry entry) {
    int id = entry.getId();
    int entryId = mine.android.api.ClockEntryAPI.findById(id);
    if (entryId == (-1))
        return false;
    
    mine.android.api.ClockEntryAPI.list.remove(entryId);
    mine.android.api.ClockEntryAPI.list.add(entry);
    mine.android.api.ClockEntryAPI.save();
    if (entry.isActive())
        mine.android.api.AlarmAPI.activeClock(id);
    
    return true;
}