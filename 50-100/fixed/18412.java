@java.lang.Override
public double volume() {
    double v = 1.0;
    double[] p1 = this.p1.getCoordinates();
    double[] p2 = this.p2.getCoordinates();
    for (int i = 0; i < (dimensions()); i++) {
        v *= java.lang.Math.abs(((p1[i]) - (p2[i])));
    }
    return v;
}