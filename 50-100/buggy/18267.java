public double calculateClientWaitTime() {
    double globalTime = 0;
    double clientTime = 0;
    for (simulation.Day day : days) {
        for (simulation.Client client : day.getClients()) {
            if ((client.getWaitTime()) != 0)
                clientTime += client.getWaitTime();
            
        }
        globalTime += clientTime / (day.getClients().size());
    }
    return simulation.Simulation.round((globalTime / (config.getSimulationDays())), 2);
}