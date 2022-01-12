@java.lang.Override
public void handleEvent(com.github.rinde.rinsim.event.Event e) {
    if (!(e instanceof com.github.rinde.rinsim.core.model.pdp.PDPModelEvent)) {
        return ;
    }
    final java.util.List<com.github.rinde.rinsim.core.model.pdp.Parcel> route = new java.util.ArrayList(vehicle.getRoute());
    final com.github.rinde.rinsim.core.model.pdp.Parcel newlyAddedParcel = ((com.github.rinde.rinsim.core.model.pdp.PDPModelEvent) (e)).parcel;
    route.add(newlyAddedParcel);
    route.add(newlyAddedParcel);
    vehicle.setRoute(route);
}