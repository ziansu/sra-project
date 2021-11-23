private static java.lang.String loadECoreFile(final java.lang.String name) throws java.lang.Exception {
    assertTrue(new java.io.File(name).exists());
    cruise.umple.compiler.EcoreImportHandler handler = new cruise.umple.compiler.EcoreImportHandler();
    cruise.umple.compiler.UmpleImportModel umple = handler.readDataFromXML(name);
    return umple.generateUmple();
}