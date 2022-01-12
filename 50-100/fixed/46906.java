@java.lang.Override
public void ajaxbuild() {
    try {
        org.apache.lucene.store.Directory dir = org.apache.lucene.store.FSDirectory.open(java.nio.file.Paths.get("autocomplete"));
        org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer analyzer = new org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer();
        org.apache.lucene.search.suggest.analyzing.AnalyzingInfixSuggester suggester = new org.apache.lucene.search.suggest.analyzing.AnalyzingInfixSuggester(dir, analyzer);
        java.util.List<com.myblog.model.Blog> blogs = blogMapper.getAllBlog();
        suggester.build(new com.myblog.lucene.BlogIterator(blogs.iterator()));
    } catch (java.io.IOException e) {
        java.lang.System.err.println("Error!");
    }
}