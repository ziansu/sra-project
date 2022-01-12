public java.awt.Point findStartLocation() {
    java.awt.Point startPoint = new java.awt.Point();
    for (int i = 0; i < (level.length); i++) {
        for (int j = 0; j < (level[i].length); j++) {
            if ((level[i][j]) == 's') {
                startPoint.setLocation(i, j);
            }
        }
    }
    return startPoint;
}