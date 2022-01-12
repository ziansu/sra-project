public void deleteRecord(com.jaitlapps.bestadvice.domain.RecordEntry recordEntry) {
    com.jaitlapps.bestadvice.domain.RecordEntry findRecord = null;
    for (com.jaitlapps.bestadvice.domain.RecordEntry entry : recordEntries) {
        if (entry.getId().equals(recordEntry.getId())) {
            findRecord = entry;
            break;
        }
    }
    if (findRecord != null)
        recordEntries.remove(findRecord);
    
    dao.deleteFromFavorite(recordEntry);
}