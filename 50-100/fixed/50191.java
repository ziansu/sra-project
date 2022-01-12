public java.util.Collection<cz.cuni.mff.d3s.jdeeco.ua.map.LinkPosition> getOthersPosition(java.lang.String robotId) {
    java.util.Collection<cz.cuni.mff.d3s.jdeeco.ua.map.LinkPosition> positions = new java.util.HashSet(cz.cuni.mff.d3s.jdeeco.ua.map.DirtinessMap.ROBOT_LOCATIONS.values());
    if ((robotId != null) && (cz.cuni.mff.d3s.jdeeco.ua.map.DirtinessMap.ROBOT_LOCATIONS.containsKey(robotId))) {
        cz.cuni.mff.d3s.jdeeco.ua.map.LinkPosition excludedPosition = cz.cuni.mff.d3s.jdeeco.ua.map.DirtinessMap.ROBOT_LOCATIONS.get(robotId);
        positions.remove(excludedPosition);
    }
    return positions;
}