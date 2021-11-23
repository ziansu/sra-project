@java.lang.Override
public void run() {
    primaryStage.show();
    cz.filek.ups.Main.hideWindow();
    primaryStage.setOnCloseRequest(( event) -> {
        cz.filek.ups.config.Config.CLIENT_LISTENER_RUNNING = false;
        try {
            tcp.getSocket().close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        resetTcp();
        showLoginUI();
    });
}