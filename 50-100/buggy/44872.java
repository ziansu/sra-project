void setLength(double len) {
    semestralka.ActuallyUsefulLine v = unitVector();
    p2 = new java.awt.geom.Point2D.Double(((p1.x) + ((v.dx()) * len)), ((p1.y) + ((v.dy()) * len)));
}