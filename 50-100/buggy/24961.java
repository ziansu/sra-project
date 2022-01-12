@java.lang.Override
protected void onLaunch() {
    server = apps.Login.getServer();
    configureRemoteListeners(server);
    cloud = new view.CloudServices(server);
    menu.addItem("coucou");
    menu.addItem("SmartPen");
    if (server.getUID().equals("pact"))
        inputScreen.restart(activity);
    
}