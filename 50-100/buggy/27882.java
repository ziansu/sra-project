private static void initFactory() {
    java.lang.Class cl;
    try {
        cl = org.lex.perf.engine.EngineFactory.class.getClassLoader().loadClass("org.lex.perf.engine.EngineImpl");
        org.lex.perf.engine.EngineFactory.engineImpl = ((org.lex.perf.engine.Engine) (cl.newInstance()));
    } catch (java.lang.Throwable e) {
        org.lex.perf.engine.EngineFactory.LOGGER.error("Can't instantiate IndexFactory", e);
        throw new java.lang.RuntimeException(e);
    }
}