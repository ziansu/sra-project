@java.lang.Override
public void onDestroy() {
    mGoogleApiClient.disconnect();
    if (isAtWorkPlace) {
        android.widget.Toast.makeText(getBaseContext(), "Wyszedłeś z pracy", Toast.LENGTH_LONG).show();
        isAtWorkPlace = false;
        com.example.mierol.worktime_tracker.DataBaseManagment.saveEndEventWorkPlace(getApplicationContext(), login, localizationID);
    }
    stopSelf();
}