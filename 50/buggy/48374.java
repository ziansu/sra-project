@java.lang.Override
public boolean run(com.bladecoder.engine.model.VerbRunner cb) {
    try {
        com.bladecoder.engine.model.World.getInstance().loadChapter(chapter, scene);
    } catch (java.lang.Exception e) {
        com.bladecoder.engine.util.EngineLogger.error(e.getMessage());
    }
    return false;
}