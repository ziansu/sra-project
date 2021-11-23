java.util.ArrayList<java.awt.Point> translatePointsToShip(java.awt.Point shipVector, java.util.ArrayList<java.awt.Point> goldVector) {
    java.util.ArrayList<java.awt.Point> points = new java.util.ArrayList<java.awt.Point>();
    for (java.awt.Point p : goldVector) {
        points.add(new java.awt.Point(((p.x) - (shipVector.x)), ((p.y) - (shipVector.y))));
    }
    return points;
}