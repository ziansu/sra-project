public org.nusco.narjillos.shared.things.Thing findClosestTo(org.nusco.narjillos.shared.things.Thing thing, java.lang.String labelRegExp) {
    if (isEmpty())
        return null;
    
    java.util.Set<org.nusco.narjillos.shared.things.Thing> nearbyNeighbors = getNearbyNeighbors(thing, labelRegExp);
    if (!(nearbyNeighbors.isEmpty()))
        return findClosestTo_Amongst(thing, nearbyNeighbors, labelRegExp);
    
    return findClosestTo_Amongst(thing, allTheThings, labelRegExp);
}