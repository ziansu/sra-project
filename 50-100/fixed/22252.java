private boolean restoreFromCheckPoint(com.orientechnologies.orient.core.storage.impl.local.OAbstractCheckPointStartRecord checkPointRecord) throws java.io.IOException {
    if (checkPointRecord instanceof com.orientechnologies.orient.core.storage.impl.local.OFuzzyCheckpointStartRecord) {
        return restoreFromFuzzyCheckPoint(((com.orientechnologies.orient.core.storage.impl.local.OFuzzyCheckpointStartRecord) (checkPointRecord)));
    }
    if (checkPointRecord instanceof com.orientechnologies.orient.core.storage.impl.local.OFullCheckpointStartRecord) {
        return restoreFromFullCheckPoint(((com.orientechnologies.orient.core.storage.impl.local.OFullCheckpointStartRecord) (checkPointRecord)));
    }
    throw new com.orientechnologies.orient.core.exception.OStorageException(("Unknown checkpoint record type " + (checkPointRecord.getClass().getName())));
}