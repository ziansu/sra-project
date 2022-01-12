private void restoreFromCheckPoint(com.orientechnologies.orient.core.storage.impl.local.OAbstractCheckPointStartRecord checkPointRecord) throws java.io.IOException {
    if (checkPointRecord instanceof com.orientechnologies.orient.core.storage.impl.local.OFuzzyCheckpointStartRecord) {
        restoreFromFuzzyCheckPoint(((com.orientechnologies.orient.core.storage.impl.local.OFuzzyCheckpointStartRecord) (checkPointRecord)));
        return ;
    }
    if (checkPointRecord instanceof com.orientechnologies.orient.core.storage.impl.local.OFullCheckpointStartRecord) {
        restoreFromFullCheckPoint(((com.orientechnologies.orient.core.storage.impl.local.OFullCheckpointStartRecord) (checkPointRecord)));
        return ;
    }
    throw new com.orientechnologies.orient.core.exception.OStorageException(("Unknown checkpoint record type " + (checkPointRecord.getClass().getName())));
}