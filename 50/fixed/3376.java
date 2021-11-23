@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    getLastKnownLocation();
    locationSubject.notifyAllObservers();
    android.util.Log.d(foodie.com.foodie.GPSLocation.TAG, "Locations API connected successfully");
}