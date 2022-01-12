public static synchronized int deleteClockEntry(int id) {
    int entryId = mine.android.api.ClockEntryAPI.findById(id);
    if (entryId == (-1))
        return -1;
    
    mine.android.api.ClockEntryAPI.list.remove(entryId);
    mine.android.api.ClockEntryAPI.save();
    return id;
}