private void confirmAndExit() {
    if (new es.ucm.fdi.tp.views.swing.QuitDialog(WINDOW).getValue()) {
        server.stopServer();
        onServerClosed();
    }
}