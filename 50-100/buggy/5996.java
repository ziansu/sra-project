public static void startImport(java.lang.String docDir) {
    java.io.File cRoot = new java.io.File(docDir);
    java.io.File[] files = cRoot.listFiles();
    for (java.io.File f : files) {
        query.Doc2Mysql.mapFile(f);
        if ((query.Doc2Mysql.docMap.size()) > (query.Doc2Mysql.INSERT_PER_BATCH)) {
            query.Doc2Mysql.writeDocs(query.Doc2Mysql.docMap);
            query.Doc2Mysql.docMap.clear();
        }
    }
}