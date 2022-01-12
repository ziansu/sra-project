private void expire(org.opentripplanner.routing.alertpatch.AlertPatch alertPatch) {
    org.onebusaway.gtfs.model.AgencyAndId stop = alertPatch.getStop();
    if (stop != null) {
        patchesByStop.remove(stop, alertPatch);
    }
    java.util.List<org.onebusaway.gtfs.model.AgencyAndId> routes = alertPatch.getRoute();
    for (org.onebusaway.gtfs.model.AgencyAndId route : routes) {
        patchesByRoute.remove(route, alertPatch);
    }
    alertPatch.remove(graph);
}