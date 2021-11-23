@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.util.Log.d("API", "Connected");
    mLocation = getLocation(LocationServices.FusedLocationApi, true);
    android.util.Log.d("API", ("" + (mLocation)));
    if (((currentUser) != null) && ((mLocation) != null))
        checkIfInGeoFence(mLocation.getLongitude(), mLocation.getLatitude(), currentUser.getObjectId());
    
}