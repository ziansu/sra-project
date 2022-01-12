@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.eleith.calchoochoo.utils.IntentKeys.STOP_SEARCH_RESULT)) {
        android.os.Bundle bundle = data.getExtras();
        java.lang.String stopId = bundle.getString(BundleKeys.STOP);
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            if (lookingForSource) {
                sourceStopId = stopId;
            }else {
                destinationStopId = stopId;
            }
            chooChooLoader.loadPossibleTrips(sourceStopId, destinationStopId, new org.joda.time.LocalDateTime(stopMethod));
        }
    }
}