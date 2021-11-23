private void spawnMerging() {
    if (!(de.uni_freiburg.es.sensorrecordingtool.Recorder.isMaster))
        new de.uni_freiburg.es.sensorrecordingtool.merger.provider.MergeProviderSession(this, de.uni_freiburg.es.sensorrecordingtool.Recorder.mRecordUUID, new java.io.File(output));
    else
        startMergeService();
    
}