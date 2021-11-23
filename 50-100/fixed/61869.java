public static void main(java.lang.String[] args) throws java.io.IOException {
    com.IR.core.Document doc = new com.IR.core.Document();
    com.IR.core.Query query = null;
    try {
        query = new com.IR.core.Query(doc);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    query.showQueryResult(doc);
}