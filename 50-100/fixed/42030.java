@java.lang.Override
public void handle(javafx.stage.WindowEvent arg0) {
    arg0.consume();
    try {
        for (int i = 0; i < (popup.size()); i++) {
            popup.get(i).close();
        }
        network.cleanup();
        stage.close();
        java.lang.System.exit(1);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(((ex.getMessage()) + "\r\n"));
        ex.printStackTrace();
    }
}