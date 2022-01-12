public void addDocument(searcher.model.Document document, java.util.ArrayList<java.lang.String> terms) {
    addTerms(document, terms);
    if (!(documents.contains(document))) {
        documents.add(document);
        java.lang.System.out.println(("doc added " + (++(i))));
    }
}