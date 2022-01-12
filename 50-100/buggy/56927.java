private void cycleCheck(com.serfshack.jobwrangler.core.Dependable depended, com.serfshack.jobwrangler.core.JobManager jobManager) {
    if (depended != null) {
        if ((depended.getDependingMode(this)) != null)
            throw new com.serfshack.jobwrangler.core.Dependable.DependencyCycleException(this, depended);
        
        for (com.serfshack.jobwrangler.core.Dependable indirectDepended : depended.getDependedDependables().keySet()) {
            cycleCheck(indirectDepended, jobManager);
        }
    }
}