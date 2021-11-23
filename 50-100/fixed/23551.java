@java.lang.Override
public void onClick(android.view.View view) {
    inputMethodManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    if (mOptionsVisible) {
        animateOptionsOffScreen();
        mOptionsVisible = false;
    }
    android.location.Location mockLocation = new android.location.Location(LOCATION_SERVICE);
    mockLocation.setLongitude(OurAppConstants.GA_LONGITUDE);
    mockLocation.setLatitude(OurAppConstants.GA_LATITUDE);
    shuvalov.nikita.restaurantroulette.YelpResources.YelpAPI yelpApi = new shuvalov.nikita.restaurantroulette.YelpResources.YelpAPI(view.getContext(), mockLocation);
    java.lang.String query = mQueryEntry.getText().toString();
    yelpApi.getRestaurants(query, java.lang.Integer.parseInt(mRadius), mAdapter);
}