void addPartition(java.lang.Integer pid) {
    partitionIdToPartitionMap.put(pid, new io.vntr.spaja.SpajaPartition(pid));
    if (pid >= (nextPid)) {
        nextPid = pid + 1;
    }
}