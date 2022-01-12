private static <T> void addGroupAtId(java.util.List<T> seqResGroups, T group, int sequenceIndexId) {
    while ((seqResGroups.size()) <= sequenceIndexId) {
        seqResGroups.add(null);
    } 
    if (sequenceIndexId > 0) {
        seqResGroups.set(sequenceIndexId, group);
    }
}