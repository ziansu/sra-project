private void placeRangedUnit(kingofthehill.domain.GameManager gm) {
    int[] laneRange = baseLanesToDefend();
    int lane = getNextRandom(laneRange[0], laneRange[1]);
    if ((this.getBase().getUnit(((lane * 4) + 3))) == null) {
        this.spawnUnit(UnitType.RANGED, (3 + (lane * 4)));
    }
}