public void periodicUpdate() {
    for (org.nusco.narjillos.shared.things.Thing creature : narjillos) {
        org.nusco.narjillos.creature.Narjillo narjillo = ((org.nusco.narjillos.creature.Narjillo) (creature));
        org.nusco.narjillos.shared.physics.Vector closestTarget = findClosestFoodPiece(narjillo);
        narjillo.setTarget(closestTarget);
    }
}