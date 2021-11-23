public void addUser(io.vntr.User user) {
    java.lang.Integer masterPartitionId = getPartitionIdWithFewestMasters();
    io.vntr.spaja.SpajaUser spajaUser = new io.vntr.spaja.SpajaUser(user.getId(), alpha, minNumReplicas, this);
    spajaUser.setMasterPartitionId(masterPartitionId);
    spajaUser.setPartitionId(masterPartitionId);
    addUser(spajaUser, masterPartitionId);
    for (java.lang.Integer id : getPartitionsToAddInitialReplicas(masterPartitionId)) {
        addReplica(spajaUser, id);
    }
    int uid = user.getId();
    if (uid >= (nextUid)) {
        nextUid = uid + 1;
    }
}