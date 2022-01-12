public boolean isOnRoad(utilities.Node center, float centerRadius) {
    if ((roadNetwork) == null) {
        roadNetwork = new com.badlogic.gdx.utils.Array<utilities.Node>();
        roadNetwork = getRoadNetwork();
    }
    if ((radar.scanNodeArray(roadNetwork, roadRadius, center, centerRadius).size) != 0) {
        return true;
    }
    return false;
}