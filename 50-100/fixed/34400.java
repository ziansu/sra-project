private void displayEvents(java.util.List<com.animedetour.android.model.Event> events) {
    this.itemAdapter.setItems(events);
    this.toggleEmptyView(events.isEmpty());
    if (false == (events.isEmpty())) {
        this.restoreState();
    }
}