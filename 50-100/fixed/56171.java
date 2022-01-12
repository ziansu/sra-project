public synchronized void removePendingDisplayHpcJobInfo(final java.util.Set<edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo> removingJobSet) {
    for (final edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo hpcJobInfo : removingJobSet) {
        for (edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo pendingJob : pendingDisplayHpcJobInfoSet) {
            if ((hpcJobInfo.getId()) == (pendingJob.getId())) {
                pendingDisplayHpcJobInfoSet.remove(pendingJob);
                continue;
            }
        }
    }
}