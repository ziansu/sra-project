private void createSchema(com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx databaseDocumentTx) {
    ODatabaseRecordThreadLocal.INSTANCE.set(databaseDocumentTx);
    com.orientechnologies.orient.core.metadata.schema.OSchema schema = databaseDocumentTx.getMetadata().getSchema();
    com.orientechnologies.orient.core.metadata.schema.OClass testOneClass = schema.createClass("TestOne");
    testOneClass.createProperty("intProp", OType.INTEGER);
    testOneClass.createProperty("stringProp", OType.STRING);
    testOneClass.createProperty("stringSet", OType.EMBEDDEDSET, OType.STRING);
    testOneClass.createProperty("linkMap", OType.LINKMAP, OType.STRING);
    com.orientechnologies.orient.core.metadata.schema.OClass testTwoClass = schema.createClass("TestTwo");
    testTwoClass.createProperty("stringList", OType.EMBEDDEDLIST, OType.STRING);
}