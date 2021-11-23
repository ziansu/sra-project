private void handleStatusChange() {
    if ((mainViewPresenter.tripListView.getVisibility()) == (android.view.View.VISIBLE)) {
        mainViewPresenter.showTripListView(dataModel.getTrips());
    }
    if ((dataModel.getConfig()) != null) {
        mainViewPresenter.setVenueTitle(dataModel.getConfig().venueName, null);
    }
}