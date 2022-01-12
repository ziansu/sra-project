private void generateMap() {
    model.HuntingMap.HuntTerrainGenerator mapGen = new model.HuntingMap.HuntTerrainGenerator(this.context, this.mapYMax, this.mapXMax, this.MAP_DENSITY, this.MAP_STONY, huntMapRand, this.TILE_WIDTH, this.TILE_HEIGHT, this.bckGround);
    this.huntingGroundsMap = mapGen.getHuntingGroundsMap();
}