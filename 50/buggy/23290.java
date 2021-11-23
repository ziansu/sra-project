@java.lang.Override
public java.util.List<data_structures.treasure.Treasure> getNearTreasures(java.lang.Integer token, java.lang.Double longitude, java.lang.Double latitude) {
    assert isTokenActive(token);
    return getNearTreasures(token, longitude, latitude, 1000.0);
}