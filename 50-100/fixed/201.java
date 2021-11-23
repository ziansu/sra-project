private void expire(org.opentripplanner.routing.alertpatch.AlertPatch alertPatch) {
    org.onebusaway.gtfs.model.AgencyAndId stop = alertPatch.getStop();
    if (stop != null) {
        patchesByStop.remove(stop, alertPatch);
    }
    java.util.List<org.onebusaway.gtfs.model.AgencyAndId> routes = alertPatch.getRoute();
    if (routes != null)
        for (org.onebusaway.gtfs.model.AgencyAndId route : routes)
            if (route != null)
                patchesByRoute.remove(route, alertPatch);
            
        
    
    alertPatch.remove(graph);
}