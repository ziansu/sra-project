public void addDocument(fts.bean.Page page) throws java.io.IOException {
    org.apache.lucene.document.Document doc = new org.apache.lucene.document.Document();
    doc.add(new org.apache.lucene.document.TextField("url", page.getUrl(), org.apache.lucene.document.Field.Store.YES));
    doc.add(new org.apache.lucene.document.TextField("title", page.getTitle(), org.apache.lucene.document.Field.Store.YES));
    doc.add(new org.apache.lucene.document.TextField("content", page.getContent(), org.apache.lucene.document.Field.Store.YES));
    indexWriter.addDocument(doc);
}