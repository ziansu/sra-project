private void placeRocks() {
    java.awt.Point[] rocks = new java.awt.Point[14];
    for (int i = 0; i < 14; i++) {
        rocks[i] = makeRock();
    }
    for (java.awt.Point p : rocks) {
        map.getCell(p).setRocky(true);
    }
}