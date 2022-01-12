private static boolean leftTurn(java.awt.Point p1, java.awt.Point p2, java.awt.Point p3) {
    return ((((p2.x) - (p1.x)) * ((p3.y) - (p1.y))) - (((p2.y) - (p1.y)) * ((p3.x) - (p1.x)))) >= 0;
}