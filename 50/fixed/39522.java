public void update(int userIndex, org.joda.time.DateTime param, org.joda.time.DateTime originalParam) {
    if (originalParam != null) {
        removeIdFromAllDateMaps(originalParam, userIndex);
    }
    addToAllDateMaps(param, userIndex);
}