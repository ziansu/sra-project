private void cycleCheck(com.serfshack.jobwrangler.core.Dependable depended) throws com.serfshack.jobwrangler.core.Dependable.DependencyCycleException {
    if (depended != null) {
        if ((depended.getDependingMode(this)) != null)
            throw new com.serfshack.jobwrangler.core.Dependable.DependencyCycleException(this, depended);
        
        for (com.serfshack.jobwrangler.core.Dependable indirectDepended : depended.getDependedDependables().keySet()) {
            cycleCheck(indirectDepended);
        }
    }
}