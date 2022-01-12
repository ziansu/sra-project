public void buildAllDocuments() {
    java.lang.String url;
    for (java.util.Iterator<java.lang.String> it = documents.keySet().iterator(); it.hasNext();) {
        url = it.next();
        documents.get(url).calculateTfIdf(this);
    }
}