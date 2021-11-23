private static void cleanRunners() {
    synchronized(ngspipesengine.logic.engine.EngineManager.LOCK) {
        for (java.lang.Integer id : ngspipesengine.logic.engine.EngineManager.RUNNERS.keySet()) {
            ngspipesengine.logic.engine.EngineRunner runner = ngspipesengine.logic.engine.EngineManager.RUNNERS.get(id);
            if (runner.finished())
                ngspipesengine.logic.engine.EngineManager.RUNNERS.remove(id);
            
        }
    }
}