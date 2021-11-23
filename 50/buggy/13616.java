public void register(org.jboss.arquillian.container.jetty.embedded_6_1.ExtensionBuilder builder) {
    builder.service(org.jboss.arquillian.container.spi.client.container.DeployableContainer.class, org.jboss.arquillian.container.jetty.embedded_6_1.JettyEmbeddedContainer.class);
    builder.service(org.jboss.arquillian.test.spi.enricher.resource.ResourceProvider.class, org.jboss.arquillian.container.jetty.ServletContextResourceProvider.class);
}