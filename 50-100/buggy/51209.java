@java.lang.Override
public void onClick(android.view.View v) {
    if ((delegate) != null) {
        support.im.location.Location location = new support.im.location.Location();
        com.amap.api.services.geocoder.StreetNumber streetNumber = regeocodeAddress.getStreetNumber();
        com.amap.api.services.core.LatLonPoint latLonPoint = streetNumber.getLatLonPoint();
        location.latitude = latLonPoint.getLatitude();
        location.longitude = latLonPoint.getLongitude();
        location.title = regeocodeAddress.getFormatAddress();
        location.snippet = streetNumber.getStreet();
        delegate.didSelectLocation(location);
    }
}