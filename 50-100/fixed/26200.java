public java.util.List<com.caij.codehub.bean.event.EventWrap> convert(java.util.List<com.caij.codehub.bean.event.Event> events) {
    if (events != null) {
        java.util.List<com.caij.codehub.bean.event.EventWrap> eventWraps = new java.util.ArrayList(events.size());
        com.caij.codehub.bean.event.EventWrap eventWrap = null;
        for (com.caij.codehub.bean.event.Event event : events) {
            eventWrap = com.caij.codehub.bean.event.EventWrap.convert(event);
            eventWraps.add(eventWrap);
        }
        return eventWraps;
    }
    return null;
}