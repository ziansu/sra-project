public void initialize(java.lang.String centerAddress, double lat, double lon, java.lang.String radiusInMiles) {
    mapSearchView.hideRetryView();
    mapSearchView.hideEmptyView();
    mapSearchView.hideStopsView();
    mapSearchView.showLoadingView();
    this.lat = lat;
    this.lon = lon;
    this.centerAddress = centerAddress;
    getStopsNearLocation.setParameters(lat, lon, radiusInMiles);
    getStopsNearLocation.execute(new com.tamerbarsbay.depothouston.presentation.presenter.MapSearchPresenter.NearbyStopsSubscriber());
}