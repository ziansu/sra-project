public java.awt.Point[] makeRocks() {
    java.awt.Point[] rocks = new java.awt.Point[14];
    for (int i = 0; i < 14; i++) {
        rocks[i] = makeRock();
    }
    return rocks;
}