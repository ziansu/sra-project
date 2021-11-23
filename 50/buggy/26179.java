public void beitreten(android.view.View v) {
    if (appsolutegamesgmbh.schnaps2gether.GUI.Lobby.m_GoogleApiClient.isConnected()) {
        android.widget.Toast.makeText(appContext, "Suche nach offenen Spielen...", Toast.LENGTH_SHORT).show();
        appsolutegamesgmbh.schnaps2gether.GUI.Lobby.spieleIdListe.clear();
        appsolutegamesgmbh.schnaps2gether.GUI.Lobby.spieleListe.clear();
        startDiscovery();
    }
}