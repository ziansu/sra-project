public double calculateTotalClientTime() {
    double globalTime = 0;
    double clientTime = 0;
    for (simulation.Day day : days) {
        clientTime = 0;
        for (simulation.Client client : day.getClients()) {
            clientTime += (client.getDepartureTime()) - (client.getRealArrivalTime());
        }
        globalTime += clientTime / (day.getClients().size());
    }
    return simulation.Simulation.round((globalTime / (config.getSimulationDays())), 2);
}