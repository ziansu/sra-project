public synchronized void copy(robot.Cinematique autre) {
    synchronized(autre) {
        position.copy(autre.position);
        autre.orientationGeometrique = orientationGeometrique;
        autre.orientationReelle = orientationReelle;
        autre.enMarcheAvant = enMarcheAvant;
        autre.courbureGeometrique = courbureGeometrique;
        autre.courbureReelle = courbureReelle;
    }
}