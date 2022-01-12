private void addEntryToDatabase(int chapterNum, java.lang.String personName, int diaryResource, int month, int date, java.lang.String type) {
    if ((com.jensen.draculadaybyday.Entries.EntryListActivity.fragmentEntryHandler) != null) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(1893, (month - 1), date);
        com.jensen.draculadaybyday.Entries.EntryListActivity.fragmentEntryHandler.addEntry(new com.jensen.draculadaybyday.Fragment.FragmentEntry(com.jensen.draculadaybyday.Entries.EntryListActivity.storyEntryNumber, (-1), chapterNum, personName, getStringFromId(diaryResource), calendar, type));
        (com.jensen.draculadaybyday.Entries.EntryListActivity.storyEntryNumber)++;
    }
}