public static void main(java.lang.String... args) throws java.lang.Exception {
    org.elasticsoftware.elasticactors.runtime.ElasticActorsBootstrapper bootstrapper = new org.elasticsoftware.elasticactors.runtime.ElasticActorsBootstrapper();
    bootstrapper.init();
    bootstrapper.getNode().join();
}