@java.lang.Override
public void run() {
    if ((stopWordList) != null) {
        stopWords = parseDocument(stopWordList);
    }
    searcher.model.Document doc = new searcher.model.Document();
    doc.setDocumentId((((file.getParentFile().getName()) + "/") + (file.getName())));
    index.addDocument(doc, normalizeToken(parseDocument(file)));
}