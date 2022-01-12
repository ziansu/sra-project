private static java.lang.String loadECoreFile(java.lang.String name) throws java.lang.Exception {
    java.lang.String filename = cruise.umple.compiler.UmpleImportTest.getAbsFile(name);
    assertTrue(new java.io.File(filename).exists());
    cruise.umple.compiler.EcoreImportHandler handler = new cruise.umple.compiler.EcoreImportHandler();
    cruise.umple.compiler.UmpleImportModel umple = handler.readDataFromXML(filename);
    return umple.generateUmple();
}