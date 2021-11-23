@java.lang.Override
public void handleEvent(org.matsim.api.core.v01.events.PersonEntersVehicleEvent event) {
    final java.lang.String vehicle = event.getVehicleId().toString();
    final org.matsim.api.core.v01.Id<org.matsim.api.core.v01.population.Person> person = event.getPersonId();
    if (playground.clruch.export.HelperFunction.isPerson(person)) {
        java.util.Set<org.matsim.api.core.v01.Id<org.matsim.api.core.v01.population.Person>> set = getCustomerSet(vehicle);
        if (set.isEmpty()) {
            firstCustomerEntersVehicleEvent.put(vehicle, event);
        }
        set.add(person);
    }
}