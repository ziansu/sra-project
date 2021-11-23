@java.lang.SuppressWarnings(value = "rawtypes")
private void customizeMaxHttpHeaderSize(org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory factory, final int maxHttpHeaderSize) {
    factory.addConnectorCustomizers(new org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer() {
        @java.lang.Override
        public void customize(org.apache.catalina.connector.Connector connector) {
            org.apache.coyote.ProtocolHandler handler = connector.getProtocolHandler();
            if (handler instanceof org.apache.coyote.http11.AbstractHttp11Protocol) {
                org.apache.coyote.http11.AbstractHttp11Protocol protocol = ((org.apache.coyote.http11.AbstractHttp11Protocol) (handler));
                protocol.setMaxHttpHeaderSize(maxHttpHeaderSize);
            }
        }
    });
}