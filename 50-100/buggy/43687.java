private int calcWidth(javafx.geometry.Point2D p, boolean searchDown) {
    int i = 0;
    while (this.mGrid[((int) (p.getX()))][((int) (p.getY()))]) {
        i++;
        if (searchDown) {
            p.add(0, 1);
        }else {
            p.add(0, (-1));
        }
    } 
    return i;
}