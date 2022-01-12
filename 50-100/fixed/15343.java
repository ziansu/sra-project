@java.lang.Override
protected void onLaunch() {
    configureRemoteListeners(server);
    menu.addItem("Morpion");
    menu.addItem("Ecriture");
    menu.addItem("Dessin");
    menu.addItem("Enregistrer");
    menu.setAppName("Partage");
    menu.setDistantUID(this.distantUID);
    inputScreen.restart(apps.Pactivity, server);
}