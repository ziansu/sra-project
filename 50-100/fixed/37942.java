@java.lang.Override
public void run() {
    if ((java.lang.System.currentTimeMillis()) > ((lastTypeTimestamp) + (es.dmoral.protestr.create_event.CreateEventActivity.TEXT_DELAY_THRESHOLD))) {
        es.dmoral.protestr.utils.LocationUtils.getLocationFromAddress(this, lastTypedMessage, new es.dmoral.protestr.utils.LocationUtils.OnAddressDecodedListener() {
            @java.lang.Override
            public void onAddressDecoded(final com.google.android.gms.maps.model.LatLng latLng, java.lang.String iso3) {
                es.dmoral.protestr.create_event.CreateEventActivity.this.iso3 = iso3;
                runOnUiThread(new java.lang.Runnable() {
                    @java.lang.Override
                    public void run() {
                        moveMapCamera(latLng);
                    }
                });
            }
        });
    }
}