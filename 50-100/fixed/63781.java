public void handleOnTrackerAdded(com.firebirdberlin.tinytimetracker.events.OnTrackerAdded event) {
    android.widget.ArrayAdapter<com.firebirdberlin.tinytimetracker.models.TrackerEntry> adapter = ((android.widget.ArrayAdapter<com.firebirdberlin.tinytimetracker.models.TrackerEntry>) (spinner.getAdapter()));
    adapter.add(event.tracker);
    sortTrackers();
    adapter.notifyDataSetChanged();
    setSelection(event.tracker.id);
}