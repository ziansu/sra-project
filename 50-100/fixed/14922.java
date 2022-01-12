@lombok.Synchronized
void beginNewCheckpoint(java.lang.String checkpointId, java.util.Set<java.lang.String> currentReaders) {
    if (!(checkpointPositions.containsKey(checkpointId))) {
        if (!(currentReaders.isEmpty())) {
            uncheckpointedHosts.put(checkpointId, new java.util.ArrayList<>(currentReaders));
        }
        checkpointPositions.put(checkpointId, new java.util.HashMap<>());
        checkpoints.add(checkpointId);
    }
}