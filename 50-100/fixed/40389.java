protected void setResultset(final java.util.List<com.orientechnologies.orient.core.db.record.OIdentifiable> iResultset) {
    currentResultSet = iResultset;
    currentRecordIdx = 0;
    currentRecord = ((iResultset == null) || (iResultset.isEmpty())) ? null : ((com.orientechnologies.orient.core.record.ORecord) (iResultset.get(0).getRecord()));
}