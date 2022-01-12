@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    com.snapsigns.utilities.FireBaseUtility fireBaseUtility = new com.snapsigns.utilities.FireBaseUtility(this);
    if (myImageSigns.isEmpty())
        fireBaseUtility.getUserSigns();
    
    startLocationUpdates();
}