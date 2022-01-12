public com.orientechnologies.orient.core.db.document.ODatabaseDocumentInternal copy() {
    com.orientechnologies.orient.core.db.document.ODatabaseDocumentEmbedded database = new com.orientechnologies.orient.core.db.document.ODatabaseDocumentEmbedded(storage);
    database.init(config);
    database.internalOpen(getUser().getName(), null, false);
    database.callOnOpenListeners();
    this.activateOnCurrentThread();
    return database;
}