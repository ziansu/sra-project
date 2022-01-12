@com.squareup.otto.Subscribe
public void searchForVenues(com.android.test.otto.VenueSearchEvent event) {
    com.android.test.qachee.QacheeData data = ((com.android.test.qachee.QacheeData) (com.qachee.QacheeManager.getInstance().get(((long) (event.place.hashCode())), true)));
    if (data == null) {
        asyncTask = new com.android.test.task.VenueBackgroundTask(event.place, gpsTracker.getLocation());
        asyncTask.execute();
    }else {
        ottoBus.post(new com.android.test.otto.VenueResultEvent(data.venues, event.place, gpsTracker.getLocation()));
    }
}