static org.apache.lucene.store.Directory setUpIndex(org.apache.lucene.analysis.Analyzer analyzer, org.apache.lucene.search.similarities.Similarity bm25) throws java.io.IOException {
    main.IndexWriterConfig config = new main.IndexWriterConfig(analyzer);
    config.setSimilarity(bm25);
    org.apache.lucene.store.FSDirectory index = org.apache.lucene.store.FSDirectory.open(new java.io.File(main.Main.indexPath).toPath());
    main.IndexWriter w = new main.IndexWriter(index, config);
    java.io.File docDir = new java.io.File(main.Main.docsPath);
    main.Main.indexDocs(w, docDir);
    w.close();
    return index;
}