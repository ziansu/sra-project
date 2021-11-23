public void reload() throws java.io.IOException {
    indexReader = new org.apache.lucene.index.MultiReader(appSearcher.getIndexReader(), leadSearcher.getIndexReader());
    indexSearcher = new com.ehi.bo.lucene.search.IndexSearcher(indexReader);
}