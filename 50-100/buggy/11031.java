private void generateJava() throws io.konig.gae.datastore.CodeGeneratorException, java.io.IOException {
    if ((java) != null) {
        if ((java.getJavaDir()) == null) {
            throw new io.konig.gae.datastore.CodeGeneratorException("javaCodeGenerator.javaDir must be defined");
        }
        java.getJavaDir().mkdirs();
        if (java.isGenerateCanonicalJsonReaders()) {
            generateCanonicalJsonReaders();
        }
        generateJavaCode(structure);
    }
}