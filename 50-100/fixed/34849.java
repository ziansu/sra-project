public static org.vitrivr.cineast.core.benchmark.engine.BenchmarkEngine getDefaultEngine() {
    org.vitrivr.cineast.core.benchmark.model.BenchmarkMode defaultMode = org.vitrivr.cineast.core.config.Config.sharedConfig().getBenchmark().getMode();
    java.nio.file.Path defaultPath = org.vitrivr.cineast.core.config.Config.sharedConfig().getBenchmark().getPath();
    return org.vitrivr.cineast.core.benchmark.BenchmarkManager.getEngine(org.vitrivr.cineast.core.benchmark.BenchmarkManager.DEFAULT_ENGINE, defaultMode, defaultPath);
}