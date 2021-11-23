private static void spielEnde() {
    if (appsolutegamesgmbh.schnaps2gether.GUI.Spielfeld3Host.spiel.Nearby.Connections.sendReliableMessage(appsolutegamesgmbh.schnaps2gether.GUI.Spielfeld3Host.mGoogleApiClient, appsolutegamesgmbh.schnaps2gether.GUI.Spielfeld3Host.endpointIDs, ((appsolutegamesgmbh.schnaps2gether.GUI.Spielfeld3Host.SPIELENDE) + ":")).getBytes());
}