public void handle(javafx.stage.WindowEvent we) {
    try {
        if ((test) == 0) {
            rc.close();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}