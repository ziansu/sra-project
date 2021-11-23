protected void parseClassPathEntry(org.mybatis.generator.config.Configuration configuration, org.w3c.dom.Node node) {
    java.util.Properties attributes = parseAttributes(node);
    configuration.addClasspathEntry(attributes.getProperty("location"));
}