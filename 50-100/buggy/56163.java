public static void show() {
    javafx.fxml.FXMLLoader l = new javafx.fxml.FXMLLoader();
    l.setLocation(main.SwekJeweled.class.getClassLoader().getResource(main.gui.NewGameViewController.fileName));
    java.lang.System.out.println("Fissa");
    try {
        javafx.scene.layout.AnchorPane newgame = l.load();
        main.SwekJeweled.getStage().setScene(new javafx.scene.Scene(newgame));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}