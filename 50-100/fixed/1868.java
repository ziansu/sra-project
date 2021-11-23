private void fillTiles() {
    util.IdToGameObjectTranslator idTrans = util.IdToGameObjectTranslator.getInstance();
    if (idTrans == null)
        for (int i = 0; i < (mapHeight); ++i) {
            for (int j = 0; j < (mapWidth); ++j) {
                tiles[i][j] = idTrans.getTileFromId(idTable[i][j]);
            }
        }
    
}