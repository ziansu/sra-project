@com.squareup.otto.Subscribe
public void onLastLocation(today.gacha.android.services.GachaLocationService.LastLocationEvent event) {
    if (event.isSuccess()) {
        animateGoogleMapCamera(event.getLocation());
        return ;
    }
    android.util.Log.d(today.gacha.android.ui.MapsActivity.TAG, ("Get last location failed - " + (event.getThrowableMessage())));
    locationService.requestCurrentLocation();
}