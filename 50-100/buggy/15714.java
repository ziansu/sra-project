@java.lang.Override
public void handle(javafx.scene.input.MouseEvent release) {
    if (root.imageHasBeenSelected()) {
        double x = release.getX();
        double y = release.getY();
        if (root.imageHasBeenSelected()) {
            int row = root.getRowForY(y);
            int col = root.getColForX(x);
            root.placeInSquareOfXY(x, y);
        }
    }
}