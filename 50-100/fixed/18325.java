public synchronized void updateSubmittedHpcJobInfo(final edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo hpcJobInfo) {
    final edu.pitt.dbmi.tetrad.db.entity.HpcAccount hpcAccount = hpcJobInfo.getHpcAccount();
    java.util.Set<edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo> hpcJobInfos = submittedHpcJobInfoMap.get(hpcAccount);
    if (hpcJobInfos != null) {
        for (edu.pitt.dbmi.tetrad.db.entity.HpcJobInfo jobInfo : hpcJobInfos) {
            if ((jobInfo.getId()) == (hpcJobInfo.getId())) {
                hpcJobInfos.remove(jobInfo);
            }
        }
        hpcJobInfos.add(hpcJobInfo);
        submittedHpcJobInfoMap.put(hpcAccount, hpcJobInfos);
    }
}