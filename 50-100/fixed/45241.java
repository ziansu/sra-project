@java.lang.Override
public void run() {
    try {
        addDepartureHandler(this.teleportationEngine);
        prepareSim();
        this.listenerManager.fireQueueSimulationInitializedEvent();
        for (org.matsim.core.mobsim.framework.MobsimAgent agent : new java.util.ArrayList(this.agents.values())) {
            arrangeNextAgentAction(agent);
        }
        boolean doContinue = true;
        while (doContinue) {
            doContinue = doSimStep();
        } 
    } finally {
        cleanupSim();
    }
}