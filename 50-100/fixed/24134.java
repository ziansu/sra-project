@java.lang.Override
public void onClick(android.view.View v) {
    try {
        com.google.android.gms.maps.model.LatLng northEast = new com.google.android.gms.maps.model.LatLng(52.648079, 13.645263);
        com.google.android.gms.maps.model.LatLng southWest = new com.google.android.gms.maps.model.LatLng(52.395659, 13.08553);
        com.google.android.gms.maps.model.LatLngBounds berlin = new com.google.android.gms.maps.model.LatLngBounds(southWest, northEast);
        android.content.Intent locationChooser = new com.google.android.gms.location.places.ui.PlacePicker.IntentBuilder().setLatLngBounds(berlin).build(getActivity());
        startActivityForResult(locationChooser, de.julis_sz.riesenkrabbe.eventViews.creator.CreatorFragment.ID_REQUEST_CODE_PLACES);
    } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException | com.google.android.gms.common.GooglePlayServicesRepairableException e) {
        e.printStackTrace();
    }
}