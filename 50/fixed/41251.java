private static void extractTermsFromPrefix(org.exist.indexing.lucene.PrefixQuery query, java.util.Map<java.lang.Object, org.exist.indexing.lucene.Query> terms, org.apache.lucene.index.IndexReader reader, boolean includeFields) throws java.io.IOException {
    org.exist.indexing.lucene.LuceneUtil.extractTerms(query.rewrite(reader), terms, reader, includeFields);
}