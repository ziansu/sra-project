protected void placeReplicatedTasks(java.util.Collection<org.voltdb.SnapshotTableTask> tasks, java.util.List<java.lang.Long> hsids) {
    org.voltdb.sysprocs.saverestore.SnapshotWritePlan.SNAP_LOG.debug(("Placing replicated tasks at sites: " + (org.voltcore.utils.CoreUtils.hsIdCollectionToString(hsids))));
    int siteIndex = 0;
    for (org.voltdb.SnapshotTableTask task : tasks) {
        java.util.ArrayList<java.lang.Long> robin = new java.util.ArrayList<java.lang.Long>();
        robin.add(hsids.get(siteIndex));
        placeTask(task, robin);
        siteIndex = (siteIndex + 1) % (hsids.size());
    }
}