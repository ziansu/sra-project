@java.lang.Override
public void onResult(@android.support.annotation.NonNull
final com.google.android.gms.common.api.Status status) {
    resultExecutor.execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            java.util.List<java.lang.String> list = new java.util.ArrayList(addingInProcessGeoIds.keySet());
            if (status.isSuccess()) {
                notifyOnGeofenceAddedSuccess(list);
            }else {
                notifyOnGeofenceAddedFailed(list);
            }
            addingInProcessGeoIds.clear();
            isAddingGeofencesInProgress = false;
        }
    });
}