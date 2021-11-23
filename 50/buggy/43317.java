public org.openbw.bwapi4j.TilePosition getBoundingBoxSize() {
    return this.bottomRight.add(this.topLeft).subtract(new org.openbw.bwapi4j.TilePosition(1, 1));
}