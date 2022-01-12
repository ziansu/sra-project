java.util.HashSet<java.awt.Point> translatePointsToShip(java.awt.Point shipVector, java.util.HashSet<java.awt.Point> goldVector) {
    java.util.HashSet<java.awt.Point> points = new java.util.HashSet<java.awt.Point>();
    for (java.awt.Point p : goldVector) {
        points.add(new java.awt.Point(((p.x) - (shipVector.x)), ((p.y) - (shipVector.y))));
    }
    return points;
}