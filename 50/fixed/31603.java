@java.lang.Override
protected void configure() {
    super.configure();
    bind(com.asquera.elasticsearch.plugins.http.HttpBasicServer.class).asEagerSingleton();
}