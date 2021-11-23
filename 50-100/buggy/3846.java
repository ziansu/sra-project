private java.util.List<com.vip.saturn.job.console.domain.JobDiffInfo> relayDiffIfPossible(java.lang.String zkCluster) throws com.vip.saturn.job.console.exception.SaturnJobConsoleException, java.lang.InterruptedException {
    try {
        return relayDiff(zkCluster);
    } catch (com.vip.saturn.job.console.exception.JobConsoleException e) {
        com.vip.saturn.job.console.controller.ZKDBDiffController.LOGGER.warn("fail to relay diff: {}", e.getMessage(), e);
        return zkDBDiffService.diffByCluster(zkCluster);
    }
}