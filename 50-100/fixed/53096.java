public void win(javafx.scene.text.Text text, javafx.scene.shape.Rectangle rectangle) {
    Main.Antagonists.logger.log(java.util.logging.Level.INFO, ">> win()");
    rectangle.setStroke(javafx.scene.paint.Color.web("Red", 1));
    rectangle.setFill(javafx.scene.paint.Color.BLACK);
    text.setFill(javafx.scene.paint.Color.WHITE);
    Main.Antagonists.logger.log(java.util.logging.Level.INFO, "-- win() > Player won the game");
    for (javafx.scene.Node e : this.antagonistBullets.getChildren()) {
        e.setVisible(false);
    }
    Main.Antagonists.logger.log(java.util.logging.Level.INFO, "-- win() > All antagonistBullets are set to invisible ");
    Main.Antagonists.logger.log(java.util.logging.Level.INFO, "<< win()");
}