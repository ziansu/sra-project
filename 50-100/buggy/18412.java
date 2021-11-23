@java.lang.Override
public double volume() {
    double v = 1.0;
    for (int i = 0; i < (dimensions()); i++) {
        v *= java.lang.Math.abs(((p1.getCoordinates()[i]) - (p2.getCoordinates()[i])));
    }
    return v;
}