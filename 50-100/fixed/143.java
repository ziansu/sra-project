public void checkState() {
    if (measurementStarted)
        if (onMeasurementRSSIsFilled()) {
            calculateMedian();
            android.util.Log.d(de.beacon.tom.viibenav_radiomapper.model.OnyxBeacon.TAG, (((de.beacon.tom.viibenav_radiomapper.model.Util.intListToString(measurementRSSIs)) + " ") + (macAddress)));
            android.util.Log.d(de.beacon.tom.viibenav_radiomapper.model.OnyxBeacon.TAG, ((("Calculated Median is: " + (medianRSSI)) + " | mac: ") + (macAddress)));
            measurementDone = true;
        }
    
}