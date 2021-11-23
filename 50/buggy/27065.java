public models.Entry getEntry(int entryID) {
    for (models.Entry e : this.getEntries()) {
        if ((e.getEntryID()) == entryID) {
            return e;
        }
    }
    return null;
}