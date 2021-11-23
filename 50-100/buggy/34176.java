protected void execute(com.buschmais.jqassistant.scm.maven.AbstractMojo.StoreOperation storeOperation, org.apache.maven.project.MavenProject rootModule) throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    synchronized(storeFactory) {
        com.buschmais.jqassistant.core.store.api.Store store = getStore(rootModule);
        if ((isResetStoreBeforeExecution()) && (currentProject.isExecutionRoot())) {
            store.reset();
        }
        try {
            storeOperation.run(rootModule, store);
        } finally {
            releaseStore(rootModule, store);
        }
    }
}