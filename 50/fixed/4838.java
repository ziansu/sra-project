@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    if ((firstLaunch) && (!(getIntent().hasExtra(com.bubelov.coins.ui.activity.MapActivity.NOTIFICATION_AREA_EXTRA)))) {
        firstLaunch = false;
        moveToLastLocation();
    }
}