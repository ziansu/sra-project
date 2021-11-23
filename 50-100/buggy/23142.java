@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, com.ck.taxoteam.taxodriver.activity.MainActivity.MY_PERMISSION_REQUEST_FINE_LOCATION);
    }
    currLocation = LocationServices.FusedLocationApi.getLastLocation(client);
    sortOrders(freeOrders);
    sortOrders(myOrders);
    for (com.ck.taxoteam.taxodriver.activity.MainActivity.OnDataReadyListener listener : onDataReadyListeners) {
        listener.onDataReady(freeOrders, com.ck.taxoteam.taxodriver.activity.MainActivity.ORDER_TYPE_FREE);
        listener.onDataReady(myOrders, com.ck.taxoteam.taxodriver.activity.MainActivity.ORDER_TYPE_MY);
    }
}