public void beitreten(android.view.View v) {
    if (appsolutegamesgmbh.schnaps2gether.GUI.Lobby.m_GoogleApiClient.isConnected()) {
        android.widget.Toast.makeText(appContext, "Suche nach offenen Spielen...", Toast.LENGTH_SHORT).show();
        startDiscovery();
    }
}