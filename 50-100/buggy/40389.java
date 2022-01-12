protected void setResultset(final java.util.List<com.orientechnologies.orient.core.db.record.OIdentifiable> iResultset) {
    currentResultSet = iResultset;
    currentRecordIdx = 0;
    currentRecord = (currentResultSet.isEmpty()) ? null : ((com.orientechnologies.orient.core.record.ORecord) (currentResultSet.get(0).getRecord()));
}