private synchronized void tickNarjillos(org.nusco.narjillos.genomics.GenePool genePool, org.nusco.narjillos.shared.utilities.RanGen ranGen) {
    java.util.Map<org.nusco.narjillos.creature.Narjillo, java.util.Set<org.nusco.narjillos.shared.things.Thing>> narjillosToCollidedFood;
    synchronized(narjillos) {
        narjillosToCollidedFood = calculateCollisions(narjillos);
    }
    for (java.util.Map.Entry<org.nusco.narjillos.creature.Narjillo, java.util.Set<org.nusco.narjillos.shared.things.Thing>> entry : narjillosToCollidedFood.entrySet()) {
        org.nusco.narjillos.creature.Narjillo narjillo = entry.getKey();
        java.util.Set<org.nusco.narjillos.shared.things.Thing> collidedFood = entry.getValue();
        consume(narjillo, collidedFood, genePool, ranGen);
    }
}