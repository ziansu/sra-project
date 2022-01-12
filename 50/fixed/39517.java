@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.content.Intent intent = new android.content.Intent(context, com.andela.motustracker.model.ActivityRecognitionDetector.class);
    callbackIntent = android.app.PendingIntent.getService(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    ActivityRecognition.ActivityRecognitionApi.requestActivityUpdates(com.andela.motustracker.model.ActivityRecognitionScan.googleApiClient, 0, callbackIntent);
}