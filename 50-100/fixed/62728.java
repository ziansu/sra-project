private java.awt.Point makeRock() {
    java.awt.Point rock;
    int x = AntMapGenerator.randInt(2, 148);
    int y = AntMapGenerator.randInt(2, 148);
    java.awt.Point p = new java.awt.Point(x, y);
    if (checkPlaceable(p)) {
        rock = p;
    }else {
        rock = makeRock();
    }
    return rock;
}