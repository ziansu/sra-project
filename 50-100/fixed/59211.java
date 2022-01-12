public void setEvents(java.util.List<org.animetwincities.animedetour.schedule.Event> events) {
    logger.debug("Received %s events", events.size());
    eventList.setEmptyView(emptyView);
    loadingIndicator.setVisibility(View.GONE);
    adapter.setEvents(events);
    logger.debug("Restoring scroll position: %s", scrollPosition);
    if ((this.scrollPosition) != (-1)) {
        eventList.setSelection(this.scrollPosition);
        scrollPosition = -1;
    }
}