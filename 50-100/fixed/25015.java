public void updateAllInstances() {
    instanceProvider.getAvailableInstances();
    profileManager.haveProfiles(accumulateProfiles());
    java.util.Collection<de.tu_bs.wire.simwatch.api.models.Instance> sims;
    synchronized(simulations) {
        sims = new java.util.ArrayList(simulations.values());
    }
    new de.tu_bs.wire.simwatch.net.HTTPUpdateProvider(this, context).update(sims);
}