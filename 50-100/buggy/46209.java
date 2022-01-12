void generateDoc(java.util.Map<javax.lang.model.element.TypeElement, java.util.Map<java.lang.Integer, com.hazelcast.client.protocol.generator.CodecModel>> model, freemarker.template.Template codecTemplate) {
    java.lang.String content = generateFromTemplate(codecTemplate, model);
    java.lang.String fileName = "HazelcastOpenBinaryProtocol-" + (getClass().getPackage().getImplementationVersion());
    saveFile(fileName, "document", content, false);
    com.hazelcast.client.protocol.generator.CodeGenerationUtils.setDocumentCreated(true);
}