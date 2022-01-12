@java.lang.Override
public void run() {
    try {
        pixyel_backend.userinterface.Userinterface.vaadinJettyServer = new pixyel_backend.userinterface.VaadinJettyServer(8080, pixyel_backend.userinterface.Userinterface.class);
        pixyel_backend.userinterface.Userinterface.vaadinJettyServer.start();
        if ((pixyel_backend.userinterface.Userinterface.onStarted) != null) {
            pixyel_backend.userinterface.Userinterface.onStarted.run();
        }
        pixyel_backend.userinterface.Userinterface.started = true;
    } catch (java.lang.Exception ex) {
        if (ex.toString().contains("Address already in use")) {
            java.lang.System.err.println((("Could not start UI, port " + (pixyel_backend.userinterface.Userinterface.PORT)) + " is used by another program, shutting down this UI"));
        }else {
            java.lang.System.err.println(("Could not start UI: " + ex));
        }
    }
}