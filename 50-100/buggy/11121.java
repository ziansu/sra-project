@java.lang.Override
public void handleEvent(org.matsim.api.core.v01.events.PersonLeavesVehicleEvent event) {
    if (!(event.getVehicleId().toString().contains("_"))) {
        inVehicle.put(event.getPersonId(), false);
        travelTimes.remove(event.getPersonId());
    }
}