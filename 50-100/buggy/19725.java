@java.lang.Override
public void handle(javafx.scene.input.MouseEvent press) {
    double x = press.getX();
    double y = press.getY();
    root.selectImage(x, y);
    if (root.imageHasBeenSelected()) {
        root.moveSelectedImageToCurrentXY(x, y);
    }
}