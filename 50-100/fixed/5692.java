@java.lang.Override
public void collectCallbackMethods() {
    logger.info("Collecting callbacks in FAST mode...");
    findClassLayoutMappings();
    for (soot.SootClass sc : soot.Scene.v().getApplicationClasses()) {
        if (sc.isConcrete()) {
            for (soot.SootMethod sm : sc.getMethods()) {
                if (sm.isConcrete()) {
                    analyzeMethodForCallbackRegistrations(null, sm);
                    analyzeMethodForDynamicBroadcastReceiver(sm);
                }
            }
            analyzeMethodOverrideCallbacks(sc, null);
        }
    }
}