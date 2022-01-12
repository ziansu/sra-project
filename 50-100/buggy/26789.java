private void restoreFromFullCheckPoint(com.orientechnologies.orient.core.storage.impl.local.OFullCheckpointStartRecord checkPointRecord) throws java.io.IOException {
    com.orientechnologies.common.log.OLogManager.instance().info(this, "Data restore procedure from full checkpoint is started. Restore is performed from LSN %s", checkPointRecord.getLsn());
    final com.orientechnologies.orient.core.storage.impl.local.OLogSequenceNumber lsn = writeAheadLog.next(checkPointRecord.getLsn());
    restoreFrom(lsn);
}