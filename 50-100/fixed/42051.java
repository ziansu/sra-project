private void processStream(java.io.InputStream stream, com.haskins.cloudtrailviewer.model.filter.CompositeFilter filter) {
    java.util.List<com.haskins.cloudtrailviewer.model.event.Event> events = createEvents(uncompress(stream));
    for (com.haskins.cloudtrailviewer.model.event.Event event : events) {
        com.haskins.cloudtrailviewer.utils.GeoIpUtils.getInstance().populateGeoData(event);
        com.haskins.cloudtrailviewer.utils.EventUtils.addTimestamp(event);
        if (filter.passes(event)) {
            event.getResourceInfo();
            eventDb.addEvent(event);
        }
    }
}