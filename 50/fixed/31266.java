@com.squareup.otto.Subscribe
public void onCurrentLocation(today.gacha.android.services.GachaLocationService.CurrentLocationEvent event) {
    if (event.isSuccess()) {
        animateGoogleMapCamera(event.getData());
        return ;
    }
    android.util.Log.w(today.gacha.android.ui.MapsActivity.TAG, ("Request current location failed - " + (event.getThrowableMessage())));
}