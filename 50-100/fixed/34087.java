public static synchronized int updateClockEntry(mine.android.api.modules.ClockEntry entry) {
    int id = entry.getId();
    int entryId = mine.android.api.ClockEntryAPI.findById(id);
    if (entryId == (-1))
        return -1;
    
    mine.android.api.ClockEntryAPI.list.remove(entryId);
    mine.android.api.ClockEntryAPI.list.add(entry);
    mine.android.api.ClockEntryAPI.save();
    return entryId;
}