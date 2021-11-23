public void handle(javafx.event.Event arg0) {
    gui.CartaGUI tmp = ((gui.CartaGUI) (arg0.getTarget()));
    if (b.gioca(tmp.getC())) {
        java.lang.System.out.println(arg0.getTarget().getClass());
        tmp.setUsata(true);
        gui.ManagerAggiornamento.notifica();
    }
}