private static java.lang.String loadScxmlFile(java.lang.String name) throws java.lang.Exception {
    java.lang.String filename = cruise.umple.compiler.UmpleImportTest.getFullFilePath(name);
    assertEquals(true, new java.io.File(filename).exists());
    cruise.umple.compiler.ScxmlImportHandler handler = new cruise.umple.compiler.ScxmlImportHandler();
    cruise.umple.compiler.UmpleImportModel umple = handler.readDataFromXML(filename);
    return umple.generateUmple();
}