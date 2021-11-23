public void setNetworkProvider(de.fuberlin.winfo.project.algorithm.NetworkProvider np, de.fuberlin.winfo.project.algorithm.impl.sven.vns.VNSMonitor monitor) {
    networkProvider = np;
    this.restrictions = new de.fuberlin.winfo.project.algorithm.restriction.Restrictions(networkProvider);
    this.restrictions.addAll();
}