public synchronized void removePendingDisplayHpcJobInfo(final java.util.Set<edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo> removingJobSet) {
    for (final edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo hpcJobInfo : removingJobSet) {
        for (java.util.Iterator<edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo> it = pendingDisplayHpcJobInfoSet.iterator(); it.hasNext();) {
            final edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo pendingJob = it.next();
            if ((hpcJobInfo.getId()) == (pendingJob.getId())) {
                pendingDisplayHpcJobInfoSet.remove(pendingJob);
                continue;
            }
        }
    }
}