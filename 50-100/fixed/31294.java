private org.rythmengine.RythmEngine getEngine(act.app.App app) {
    org.rythmengine.RythmEngine engine = engines.get(app);
    if (null == engine) {
        engine = createEngine(app);
        org.rythmengine.RythmEngine engine0 = engines.putIfAbsent(app, engine);
        if (null != engine0) {
            engine.shutdown();
            engine = engine0;
        }
    }
    return engine;
}