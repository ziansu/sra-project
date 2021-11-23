@java.lang.Override
public void handle(javafx.scene.input.MouseEvent drag) {
    if (this.root.imageHasBeenSelected()) {
        double x = drag.getX();
        double y = drag.getY();
        this.root.moveSelectedImageToCurrentXY(x, y);
    }
}