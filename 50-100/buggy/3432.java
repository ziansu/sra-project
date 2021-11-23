public final double getDuree(double translationalSpeed, int tempsArret) {
    int nb = getNbPoints();
    double out = 0;
    for (int i = 0; i < nb; i++)
        out += (ClothoidesComputer.PRECISION_TRACE_MM) / (java.lang.Math.max(getPoint(i).maxSpeed, translationalSpeed));
    
    return out + ((vitesse.getNbArrets()) * tempsArret);
}