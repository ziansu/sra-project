public final java.util.List<org.eclipse.egit.github.core.event.Event> getAllPublicEvents() {
    final java.util.List<org.eclipse.egit.github.core.event.Event> allEvents = new java.util.ArrayList<>();
    final org.eclipse.egit.github.core.service.EventService eventService = githubClientProvider.getEventService();
    final org.eclipse.egit.github.core.client.PageIterator<org.eclipse.egit.github.core.event.Event> eventPages = eventService.pagePublicEvents();
    while ((eventPages.hasNext()) && ((eventService.getClient().getRemainingRequests()) > 0)) {
        allEvents.addAll(eventPages.next());
    } 
    return allEvents;
}