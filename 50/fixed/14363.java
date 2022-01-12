public void openTripOverview() {
    if ((tripView) == null) {
        tripView = new controller.common.TripView(this);
    }
    setNewView("Trip Overview", tripView);
    openView(currentViewNo);
}