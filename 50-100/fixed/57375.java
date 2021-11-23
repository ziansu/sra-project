protected org.joda.time.DateTime initDtEvents(java.util.List<model.Event> events) {
    if (!(events.isEmpty())) {
        sorting.StartTimeSorter sts = new sorting.StartTimeSorter();
        events = sts.sort(events);
        return events.get(0).getStartTime();
    }else
        return new org.joda.time.DateTime();
    
}