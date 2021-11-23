public void handle(javafx.stage.WindowEvent we) {
    try {
        if ((test) == 1) {
            rc.close();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}