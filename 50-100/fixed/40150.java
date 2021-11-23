protected void startModules(boolean skipLoadingMetadata) {
    if (skipLoadingMetadata) {
        com.graphaware.runtime.BaseGraphAwareRuntime.LOG.info("Metadata loading skipped.");
    }else {
        com.graphaware.runtime.BaseGraphAwareRuntime.LOG.info("Loading module metadata...");
        java.util.Set<java.lang.String> moduleIds = loadMetadata();
        cleanupMetadata(moduleIds);
        com.graphaware.runtime.BaseGraphAwareRuntime.LOG.info("Module metadata loaded.");
    }
}