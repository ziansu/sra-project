public com.majalis.scenes.Scene getStartScene() {
    upsertScenes();
    if ((sceneCode) == (-1)) {
        saveService.saveDataValue(SaveEnum.MUSIC, AssetEnum.ENCOUNTER_MUSIC.getPath());
        return scenes.get(0);
    }
    return masterSceneMap.get(sceneCode);
}