public com.orientechnologies.orient.core.db.document.ODatabaseDocumentInternal copy() {
    com.orientechnologies.orient.core.db.document.ODatabaseDocumentEmbedded database = new com.orientechnologies.orient.core.db.document.ODatabaseDocumentEmbedded(storage);
    database.init(config);
    java.lang.String user;
    if ((getUser()) != null) {
        user = getUser().getName();
    }else {
        user = null;
    }
    database.internalOpen(user, null, false);
    database.callOnOpenListeners();
    this.activateOnCurrentThread();
    return database;
}