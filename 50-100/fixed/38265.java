@java.lang.Override
public void onConnectionResponse(java.lang.String remoteEndpointId, com.google.android.gms.common.api.Status status, byte[] bytes) {
    if (status.isSuccess()) {
        android.widget.Toast.makeText(appContext, "Geräte wurden verbunden! ", Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(appContext, "Geräte konnten nicht verbunden werden!", Toast.LENGTH_SHORT).show();
    }
}