private void checkGpsStatus() {
    if (!(com.example.aprokopenko.triphelper.utils.util_methods.UtilMethods.checkIfGpsEnabled(context))) {
        setGpsIconTurnedOff();
    }else {
        gpsIsActive = true;
    }
}