public rssminer.Feed[] likeThis(int docID, int count) throws java.io.IOException, org.apache.lucene.index.CorruptIndexException {
    org.apache.lucene.index.IndexReader reader = org.apache.lucene.index.IndexReader.open(indexer, true);
    org.apache.lucene.search.similar.MoreLikeThis likeThis = new org.apache.lucene.search.similar.MoreLikeThis(reader);
    likeThis.setFieldNames(rssminer.Searcher.FIELDS);
    likeThis.setMinTermFreq(1);
    likeThis.setMinDocFreq(3);
    org.apache.lucene.search.Query like = likeThis.like(docID);
    return searchQuery(new org.apache.lucene.search.IndexSearcher(reader), like, count);
}