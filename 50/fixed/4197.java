@org.springframework.context.annotation.Bean(name = "configLoader", initMethod = "load")
public com.pleuvoir.loader.ConfigLoader getConfigLoader() {
    com.pleuvoir.loader.ConfigLoader loader = new com.pleuvoir.loader.XmlConfigLoader();
    loader.setLocation("classpath:config.xml");
    return loader;
}