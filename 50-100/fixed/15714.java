@java.lang.Override
public void handle(javafx.scene.input.MouseEvent release) {
    if (this.root.imageHasBeenSelected()) {
        double x = release.getX();
        double y = release.getY();
        if (this.root.imageHasBeenSelected()) {
            int row = this.root.getRowForY(y);
            int col = this.root.getColForX(x);
            this.root.placeInSquareOfXY(x, y);
        }
    }
}