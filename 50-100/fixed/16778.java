@java.lang.Override
public void handleGraphEvent(org.gephi.streaming.api.event.GraphEvent event) {
    if (event instanceof org.gephi.streaming.api.event.ElementEvent) {
        org.gephi.streaming.api.event.ElementEvent elementEvent = ((org.gephi.streaming.api.event.ElementEvent) (event));
        if ((elementEvent.getElementId()) != null) {
            filterededIds.add(new org.gephi.streaming.impl.StreamingControllerImpl.FilteredEventEntry(elementEvent.getElementId(), elementEvent.getElementType(), 0));
        }
    }
    graphUpdaterHandler.handleGraphEvent(event);
}