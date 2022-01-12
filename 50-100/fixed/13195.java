private java.util.List<org.openhab.io.caldav.CalDavEvent> removeWithMatchingPlace(java.util.List<org.openhab.io.caldav.CalDavEvent> list) {
    java.util.List<org.openhab.io.caldav.CalDavEvent> out = new java.util.ArrayList<org.openhab.io.caldav.CalDavEvent>();
    for (org.openhab.io.caldav.CalDavEvent event : list) {
        if (this.homeIdentifierMatch(event.getLocation())) {
            continue;
        }
        out.add(event);
    }
    return out;
}