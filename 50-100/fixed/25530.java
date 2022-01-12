@java.lang.Override
public void process(wagon.simulation.SystemState state) {
    wagon.rollingstock.Composition composition = trip.composition();
    int trainID = composition.id();
    double currentOccupation = state.getOccupation(trainID);
    double passengersToAlight = 1;
    state.setOccupation(trainID, (currentOccupation - passengersToAlight));
}