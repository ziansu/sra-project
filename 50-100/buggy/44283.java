@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object data) {
    if (!(observable.equals(restClient)))
        return ;
    
    android.util.Log.i(uk.ac.ic.doc.t4t.EventMapActivity.TAG, "Updating event list");
    eventItems = ((java.util.List<uk.ac.ic.doc.t4t.eventlist.EventItem>) (data));
    addEventOverlay(eventItems);
}