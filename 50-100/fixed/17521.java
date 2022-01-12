private static java.lang.String loadScxmlFile(final java.lang.String name) throws java.lang.Exception {
    assertTrue(new java.io.File(name).exists());
    cruise.umple.compiler.ScxmlImportHandler handler = new cruise.umple.compiler.ScxmlImportHandler();
    cruise.umple.compiler.UmpleImportModel umple = handler.readDataFromXML(name);
    return umple.generateUmple();
}