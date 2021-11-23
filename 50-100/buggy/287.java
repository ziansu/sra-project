@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    if (status == (android.location.LocationProvider.AVAILABLE)) {
        activity.setGPSStatus("Connected");
    }else
        if (status == (android.location.LocationProvider.OUT_OF_SERVICE)) {
            activity.setGPSStatus("No Connection");
        }else
            if (status == (android.location.LocationProvider.TEMPORARILY_UNAVAILABLE)) {
                activity.setGPSStatus("No Connection");
            }
        
    
}