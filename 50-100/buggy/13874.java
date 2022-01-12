public void setRecording(boolean recording) {
    this.recording = recording;
    time = 0;
    pos = 0;
    if (recording) {
        com.bladecoder.engine.util.EngineLogger.debug("RECORDING...");
        com.bladecoder.engine.model.World.getInstance().saveGameState(((com.bladecoder.engine.ui.Recorder.DEFAULT_RECORD_FILENAME) + (com.bladecoder.engine.ui.Recorder.GAMESTATE_EXT)));
    }else
        save();
    
}