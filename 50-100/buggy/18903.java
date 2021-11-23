public void save() {
    com.badlogic.gdx.utils.Json json = new com.badlogic.gdx.utils.Json();
    java.lang.String s = json.prettyPrint(list);
    java.io.Writer w = com.bladecoder.engine.assets.EngineAssetManager.getInstance().getUserFile(((com.bladecoder.engine.ui.Recorder.DEFAULT_RECORD_FILENAME) + (com.bladecoder.engine.ui.Recorder.RECORD_EXT))).writer(false, "UTF-8");
    try {
        w.write(s);
        w.close();
    } catch (java.io.IOException e) {
        com.bladecoder.engine.util.EngineLogger.error("ERROR SAVING RECORD", e);
    }
}