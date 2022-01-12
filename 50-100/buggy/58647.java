@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    nl.amsta09.driver.MainApp.slideShowController = new nl.amsta09.app.SlideShowController(primaryStage);
    nl.amsta09.driver.MainApp.slideShowController.initialize();
    nl.amsta09.driver.MainApp.server = new nl.amsta09.web.JettyServer();
    nl.amsta09.driver.MainApp.server.setHandler();
    try {
        nl.amsta09.driver.MainApp.server.start();
    } catch (java.lang.Exception e) {
        nl.amsta09.driver.MainApp.die("Opstarten webserver mislukt", ("Het opstarten van de ingebouwde webserver is mislukt." + " Start het apparaat alstublieft opnieuw op."));
    }
    nl.amsta09.driver.MainApp.mediaSessionManager = new nl.amsta09.web.util.MediaSessionManager();
}