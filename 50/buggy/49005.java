public void registerExtensions() {
    org.asciidoctor.extension.JavaExtensionRegistry extensionRegistry = asciidoctor.javaExtensionRegistry();
    extensionRegistry.preprocessor(com.mulesoft.documentation.builder.CodeLineNumberPreProcessor.class);
    extensionRegistry.block("tabs", com.mulesoft.documentation.builder.TabProcessor.class);
    extensionRegistry.preprocessor(com.mulesoft.documentation.builder.LinenumsProcessor.class);
}