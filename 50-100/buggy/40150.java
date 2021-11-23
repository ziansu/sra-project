protected void startModules(boolean skipLoadingMetadata) {
    if (skipLoadingMetadata) {
        com.graphaware.runtime.BaseGraphAwareRuntime.LOG.info("Metadata loading skipped.");
    }else {
        com.graphaware.runtime.BaseGraphAwareRuntime.LOG.info("Loading module metadata...");
        try (org.neo4j.graphdb.Transaction tx = startTransaction()) {
            java.util.Set<java.lang.String> moduleIds = loadMetadata();
            cleanupMetadata(moduleIds);
            tx.success();
        }
        com.graphaware.runtime.BaseGraphAwareRuntime.LOG.info("Module metadata loaded.");
    }
}