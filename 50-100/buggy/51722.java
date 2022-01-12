public void update(double x, double y, double orientationGeometrique, boolean enMarcheAvant, double courbure) {
    if (enMarcheAvant) {
        orientationReelle = orientationGeometrique;
        courbureReelle = courbure;
    }else {
        orientationReelle = orientationGeometrique + (java.lang.Math.PI);
        courbureReelle = -courbure;
    }
    position.setX(x);
    position.setY(y);
    this.orientationGeometrique = orientationGeometrique;
    this.enMarcheAvant = enMarcheAvant;
    this.courbureGeometrique = courbure;
}