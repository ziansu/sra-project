private org.nusco.narjillos.shared.things.Thing findThingAt_WithLabel(org.nusco.narjillos.shared.physics.Vector position, java.lang.String label) {
    org.nusco.narjillos.shared.things.Thing result = null;
    double minDistance = java.lang.Double.MAX_VALUE;
    for (org.nusco.narjillos.shared.things.Thing thing : environment.getThings(label)) {
        double distance = thing.getCenter().minus(position).getLength();
        if ((distance < (thing.getRadius())) && (distance < minDistance)) {
            minDistance = distance;
            result = thing;
        }
    }
    return result;
}