private void displayEvents(java.util.List<com.animedetour.android.model.Event> events) {
    this.toggleEmptyView(events.isEmpty());
    this.itemAdapter.setItems(events);
    if (false == (events.isEmpty())) {
        this.restoreState();
    }
}