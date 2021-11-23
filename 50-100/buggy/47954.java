@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    if (status.isSuccess()) {
        android.widget.Toast.makeText(appContext, ("Vebindung hergestellt zu" + remoteEndpointName), Toast.LENGTH_SHORT).show();
        Nearby.Connections.stopAdvertising(m_GoogleApiClient);
        startActivity(new android.content.Intent(this, appsolutegamesgmbh.schnaps2gether.GUI.NeuesSpiel.class));
        finish();
    }else {
        android.widget.Toast.makeText(appContext, ("Verbindung konnte nicht hergestellt werden." + remoteEndpointName), Toast.LENGTH_SHORT).show();
    }
}