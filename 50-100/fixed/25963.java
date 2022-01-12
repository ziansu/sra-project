@java.lang.Override
public double volume() {
    double volumen = 1.0;
    final int dimension = minCorner.dimensions();
    for (int i = 0; i < dimension; i++) {
        volumen *= (maxCorner.getCoordinate(i)) - (minCorner.getCoordinate(i));
    }
    return volumen;
}