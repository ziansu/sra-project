public void addRecord(com.jaitlapps.bestadvice.domain.RecordEntry recordEntry) {
    recordEntries.add(0, recordEntry);
    dao.addToFavorite(recordEntry);
}