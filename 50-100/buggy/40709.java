private com.spamalot.dolt.map.Territory getRandomTerritoryNotLandLocked() {
    int count = 0;
    com.spamalot.dolt.map.Territory result = null;
    for (com.spamalot.dolt.map.Territory t : territories) {
        if (t.isLandLocked()) {
            continue;
        }
        count++;
        int r = com.spamalot.dolt.map.DoltWorld.RNG.nextInt(count);
        if (r == 0) {
            result = t;
        }
    }
    return result;
}