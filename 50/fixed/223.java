public static synchronized int addClockEntry(mine.android.api.modules.ClockEntry entry) {
    int newId = mine.android.api.ClockEntryAPI.getNextId();
    entry.setId(newId);
    mine.android.api.ClockEntryAPI.list.add(entry);
    mine.android.api.ClockEntryAPI.save();
    return newId;
}