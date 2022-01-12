@org.greenrobot.eventbus.Subscribe
public void onEvent(com.omkarmoghe.pokemap.models.events.LoginEventResult result) {
    if (result.isLoggedIn()) {
        com.google.android.gms.maps.model.LatLng latLng = com.omkarmoghe.pokemap.controllers.map.LocationManager.getInstance(this).getLocation();
        if (latLng != null) {
            nianticManager.getCatchablePokemon(latLng.latitude, latLng.longitude, 0.0);
        }else {
            android.support.design.widget.Snackbar.make(findViewById(R.id.root), "Failed to Login.", Snackbar.LENGTH_LONG).show();
        }
    }
}