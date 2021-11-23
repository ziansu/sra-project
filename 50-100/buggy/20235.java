@java.lang.Override
public void run() {
    if ((newValue.doubleValue()) <= 0) {
        int newSelection = enemies.getChildren().indexOf(child);
        enemies.getChildren().remove(child);
        javafx.scene.Node n = null;
        try {
            n = enemies.getChildren().get(newSelection);
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        if (n != null) {
            n.getOnMouseClicked().handle(null);
        }
    }
}