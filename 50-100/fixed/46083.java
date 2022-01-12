private void doTerrainUpdates(float dt) {
    if (terrainEditToolActivated) {
        lastModifyTime += dt;
        if ((lastModifyTime) >= (toolModifyRate)) {
            lastModifyTime = 0;
            toolController.doTerrainEditToolActivated();
            toolController.doTerrainEditToolAlternateActivated();
            lastModifyTime = app.getContext().getTimer().getTime();
        }
    }
}