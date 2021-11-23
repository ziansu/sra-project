@java.lang.Override
public void onLocationAvailability(com.google.android.gms.location.LocationAvailability locationAvailability) {
    boolean available = locationAvailability.isLocationAvailable();
    googleApiClientStatus(native_ptr_, (available ? ru.dublgis.androidlocation.GmsLocationProvider.STATUS_REQUEST_SUCCESS : ru.dublgis.androidlocation.GmsLocationProvider.STATUS_REQUEST_FAIL));
}