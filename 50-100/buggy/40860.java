private void restoreFromFuzzyCheckPoint(com.orientechnologies.orient.core.storage.impl.local.OFuzzyCheckpointStartRecord checkPointRecord) throws java.io.IOException {
    com.orientechnologies.common.log.OLogManager.instance().info(this, "Data restore procedure from FUZZY checkpoint is started.");
    com.orientechnologies.orient.core.storage.impl.local.OLogSequenceNumber flushedLsn = checkPointRecord.getFlushedLsn();
    if ((flushedLsn.compareTo(writeAheadLog.begin())) < 0)
        flushedLsn = writeAheadLog.begin();
    
    restoreFrom(flushedLsn);
}