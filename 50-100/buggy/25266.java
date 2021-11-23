public void initTiles() {
    java.util.Random rnd = new java.util.Random();
    int rndTile;
    for (int i = 0; i < 9; i++) {
        int tileIndex;
        do {
            tileIndex = rnd.nextInt(16);
        } while (!(isTileEmpty(tileIndex)) );
        rndTile = arbhres.model.structure.Grid.randomTile();
        addTile(tileIndex, rndTile);
        model.fireAddTile(tileIndex, rndTile);
        model.fireRefreshGUI();
    }
}