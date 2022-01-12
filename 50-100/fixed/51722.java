public void update(double x, double y, double orientationGeometrique, boolean enMarcheAvant, double courbureGeometrique) {
    if (enMarcheAvant) {
        orientationReelle = orientationGeometrique;
        courbureReelle = courbureGeometrique;
    }else {
        orientationReelle = orientationGeometrique + (java.lang.Math.PI);
        courbureReelle = -courbureGeometrique;
    }
    position.setX(x);
    position.setY(y);
    this.orientationGeometrique = orientationGeometrique;
    this.enMarcheAvant = enMarcheAvant;
    this.courbureGeometrique = courbureGeometrique;
}