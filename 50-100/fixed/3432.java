public final double getDuree(double translationalSpeed, int tempsArret) {
    int nb = getNbPoints();
    double out = 0;
    for (int i = 0; i < nb; i++) {
        getPoint(i).maxSpeed = java.lang.Math.min(getPoint(i).maxSpeed, translationalSpeed);
        out += (ClothoidesComputer.PRECISION_TRACE_MM) / (getPoint(i).maxSpeed);
    }
    return out + ((vitesse.getNbArrets()) * tempsArret);
}