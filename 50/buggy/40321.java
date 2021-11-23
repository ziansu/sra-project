public static void main(java.lang.String... args) throws java.lang.Exception {
    org.springframework.util.Log4jConfigurer.initLogging("classpath:log4j.properties");
    org.elasticsoftware.elasticactors.runtime.ElasticActorsBootstrapper bootstrapper = new org.elasticsoftware.elasticactors.runtime.ElasticActorsBootstrapper();
    bootstrapper.init();
    bootstrapper.getNode().join();
}