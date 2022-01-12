public void buildAllDocuments() {
    java.lang.String word;
    for (java.util.Iterator<java.lang.String> it = documents.keySet().iterator(); it.hasNext();) {
        word = it.next();
        documents.get(word).calculateTfIdf(this);
    }
}