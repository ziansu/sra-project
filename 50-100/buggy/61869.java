public static void main(java.lang.String[] args) {
    com.IR.core.Document doc = new com.IR.core.Document(26);
    com.IR.core.Query query = null;
    try {
        query = new com.IR.core.Query(doc);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    query.showQueryResult(doc);
}