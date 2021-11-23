public void generateToFile(java.io.File outputDir, java.io.InputStream auditFile, java.lang.String packageBase) throws java.io.IOException, java.net.URISyntaxException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    org.jboss.test.audit.generate.SectionsClassGenerator.GeneratedSource generatedSource = generateSource(auditFile, packageBase);
    java.io.File generatedSourceDir = new java.io.File(outputDir, org.jboss.test.audit.generate.SectionsClassGenerator.packageNameToPath(generatedSource.getPackageName()));
    generatedSourceDir.mkdirs();
    java.io.FileWriter writer = new java.io.FileWriter(new java.io.File(generatedSourceDir, ((generatedSource.getSimpleName()) + ".java")));
    writer.write(generatedSource.getValue());
    writer.close();
}