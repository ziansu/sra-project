@java.lang.Override
public void handle(javafx.scene.input.MouseEvent press) {
    double x = press.getX();
    double y = press.getY();
    this.root.selectImage(x, y);
    if (this.root.imageHasBeenSelected()) {
        this.root.moveSelectedImageToCurrentXY(x, y);
    }
}