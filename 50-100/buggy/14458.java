public bms.player.beatoraja.ReplayData readReplayData(bms.model.BMSModel model, int lnmode) {
    if (existsReplayData(model, lnmode)) {
        com.badlogic.gdx.utils.Json json = new com.badlogic.gdx.utils.Json();
        try {
            return ((bms.player.beatoraja.ReplayData) (json.fromJson(bms.player.beatoraja.ReplayData.class, new java.io.FileReader(this.getReplayDataFilePath(model.getHash(), lnmode)))));
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    return null;
}