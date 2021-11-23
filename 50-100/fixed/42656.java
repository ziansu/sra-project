private void updateTargets(org.nusco.narjillos.shared.things.Thing food) {
    synchronized(narjillos) {
        for (org.nusco.narjillos.creature.Narjillo narjillo : narjillos) {
            if (narjillo.getTarget().equals(food.getPosition())) {
                org.nusco.narjillos.shared.physics.Vector closestTarget = findClosestFoodPiece(narjillo);
                narjillo.setTarget(closestTarget);
            }
        }
    }
}