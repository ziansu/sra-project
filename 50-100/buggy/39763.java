@java.lang.Override
public void run() {
    try {
        long currentTime = java.lang.System.currentTimeMillis();
        java.util.List<org.lex.perf.engine.RrdIndex> rrdIndexList;
        synchronized(rrdIndexes) {
            rrdIndexList = new java.util.ArrayList<org.lex.perf.engine.RrdIndex>(rrdIndexes);
        }
        for (org.lex.perf.engine.RrdIndex s : rrdIndexList) {
            try {
                s.doSample(currentTime);
            } catch (java.lang.Throwable t) {
                org.lex.perf.engine.EngineImpl.LOGGER.error("error ", t);
            }
        }
        saveIndexFileNames();
    } catch (java.lang.Throwable t) {
        org.lex.perf.engine.EngineImpl.LOGGER.error("error ", t);
    }
}