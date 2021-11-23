void repartition() {
    java.util.Map<java.lang.Integer, java.lang.Integer> newPartitioning = io.vntr.repartition.MetisRepartitioner.partition(gpmetisLocation, gpmetisTempdir, getFriendships(), getPartitionToUserMap().keySet());
    for (int uid : newPartitioning.keySet()) {
        int newPid = newPartitioning.get(uid);
        if (newPid != (manager.getUser(uid).getBasePid())) {
            manager.moveUser(uid, newPid, true);
        }
    }
}