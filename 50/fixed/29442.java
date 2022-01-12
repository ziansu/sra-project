@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((selectedcell) == null) {
        ((javafx.scene.shape.Rectangle) (pane.getChildren().get(0))).setFill(javafx.scene.paint.Color.YELLOW);
        selectedcell = thiscell;
    }
}