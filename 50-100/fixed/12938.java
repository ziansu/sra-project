public void updateReel(double x, double y, double orientationReelle, boolean enMarcheAvant, double courbureReelle) {
    if (enMarcheAvant) {
        orientationGeometrique = orientationReelle;
        courbureGeometrique = courbureReelle;
    }else {
        orientationGeometrique = orientationReelle + (java.lang.Math.PI);
        courbureGeometrique = -courbureReelle;
    }
    position.setX(x);
    position.setY(y);
    this.orientationReelle = orientationReelle;
    this.enMarcheAvant = enMarcheAvant;
    this.courbureReelle = courbureReelle;
}