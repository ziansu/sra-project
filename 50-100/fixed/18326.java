public double getRunningCost() {
    long currentTime = java.lang.System.currentTimeMillis();
    double cost = 0.0;
    for (integratedtoolkit.ascetic.VM.JobExecution je : runningJobs.values()) {
        int coreId = je.impl.getCoreId();
        int implId = je.impl.getImplementationId();
        double time = ((double) (currentTime - (je.startTime))) / ((double) (3600 * 1000));
        cost += (price[coreId][implId]) * time;
    }
    return cost;
}