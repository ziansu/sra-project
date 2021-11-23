@java.lang.Override
public java.util.ArrayList<timeline.Event> getEvents(filtering.Filter<timeline.Event> filter) {
    java.util.ArrayList<timeline.Event> filteredAndSortedEvents = new java.util.ArrayList<timeline.Event>();
    for (util.serialization.Serializable item : this.serializer.getItems()) {
        filteredAndSortedEvents.add(((timeline.Event) (item)));
    }
    filteredAndSortedEvents = filter.filter(filteredAndSortedEvents);
    java.util.Collections.sort(filteredAndSortedEvents);
    return filteredAndSortedEvents;
}