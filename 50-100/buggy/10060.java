private static void flushConfig() {
    MyStaticValue.ENV.clear();
    org.ansj.elasticsearch.index.config.AnsjElasticConfigurator.setGlobalVar(MyStaticValue.ENV);
    if ((org.ansj.elasticsearch.index.config.AnsjElasticConfigurator.ansjSettings) != null) {
        org.ansj.elasticsearch.index.config.AnsjElasticConfigurator.initConfig(org.ansj.elasticsearch.index.config.AnsjElasticConfigurator.ansjSettings);
    }
    if ((org.ansj.elasticsearch.index.config.AnsjElasticConfigurator.path) != null) {
        org.ansj.elasticsearch.index.config.AnsjElasticConfigurator.initConfig(org.ansj.elasticsearch.index.config.AnsjElasticConfigurator.path, true);
    }else {
        org.ansj.elasticsearch.index.config.AnsjElasticConfigurator.initConfig(new java.io.File(org.ansj.elasticsearch.index.config.AnsjElasticConfigurator.configDir, "ansj_library.properties").getAbsolutePath(), false);
    }
}