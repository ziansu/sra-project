public void handle(javafx.event.Event arg0) {
    gui.CartaGUI tmp = ((gui.CartaGUI) (arg0.getTarget()));
    if (b.gioca(tmp.getC())) {
        tmp.setUsata(true);
        gui.ManagerAggiornamento.notifica();
    }
}