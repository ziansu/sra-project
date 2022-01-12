protected void initDtEvents(org.joda.time.DateTime dt, java.util.List<model.Event> events) {
    if (!(events.isEmpty())) {
        sorting.StartTimeSorter sts = new sorting.StartTimeSorter();
        events = sts.sort(events);
        dt = new org.joda.time.DateTime(events.get(0).getStartTime());
    }
}