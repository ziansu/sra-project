@java.lang.Override
public void invoke(cz.agents.alite.protobuf.factory.ProtobufFactory factory) {
    highwayEnvironment.addSimulatorHandler(new cz.agents.highway.environment.SimulatorHandlers.ProtobufSimulatorHandler(highwayEnvironment, plannedVehicles, factory));
    if ((section) >= simulatorCount) {
        synchronized(simulation) {
            simulation.notify();
        }
    }
    (section)++;
}