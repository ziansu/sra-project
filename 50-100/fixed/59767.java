public void QoS_commit() {
    java.lang.System.out.println("this.processNewSites");
    this.processNewSites();
    try {
        java.lang.System.out.println("this.postSetQueues");
        this.postSetQueues();
        for (orca.ahab.libndl.extras.PriorityNetwork.PriorityPath path : this.priorityPaths) {
            this.postPathMatches(path, ((this.priorityPaths.indexOf(path)) + 1));
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}