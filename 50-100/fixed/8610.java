public void generateModels() throws freemarker.template.TemplateException, java.io.IOException {
    generateCommonFiles();
    for (com.codegen.model.ClassDefinition classDefinition : this.getClassDefinitions()) {
        generatePOJO(classDefinition);
        generateDTO(classDefinition);
        generateServiceInterface(classDefinition);
        generateServiceImpl(classDefinition);
        generateDAOInterface(classDefinition);
        generateDAOImpl(classDefinition);
        generateRestClient(classDefinition);
        generateServiceTest(classDefinition);
    }
}