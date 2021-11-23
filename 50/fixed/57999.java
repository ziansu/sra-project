@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.common.api.Status status) {
    if (!(status.isSuccess())) {
        android.widget.Toast.makeText(context, ("Error drawing geofence" + status), Toast.LENGTH_SHORT).show();
    }
}