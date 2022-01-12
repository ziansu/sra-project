public float getDistanceFromOwnship() {
    float terrainMidpointX = (x) + ((com.chrisali.javaflightsim.otw.terrain.Terrain.MAX_HEIGHT) / 2);
    float terrainMidpointZ = (z) + ((com.chrisali.javaflightsim.otw.terrain.Terrain.MAX_HEIGHT) / 2);
    return ((float) (java.lang.Math.sqrt(((java.lang.Math.pow(((ownship.getPosition().x) - terrainMidpointX), 2)) + (java.lang.Math.pow(((ownship.getPosition().z) - terrainMidpointZ), 2))))));
}