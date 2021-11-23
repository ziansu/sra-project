private void handleStatusChange() {
    com.taxibutler.pro.model.api.Status status = com.taxibutler.pro.model.DataModel.instance().getStatus();
    if ((mainViewPresenter.tripListView.getVisibility()) == (android.view.View.VISIBLE)) {
        mainViewPresenter.showTripListView(dataModel.getTrips());
    }
    if ((dataModel.getConfig()) != null) {
        mainViewPresenter.setVenueTitle(dataModel.getConfig().venueName, null);
    }
}