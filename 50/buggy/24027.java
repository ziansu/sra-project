@java.lang.Override
public com.google.appengine.api.search.Index getSearchIndex(java.lang.String name) {
    com.google.appengine.api.search.IndexSpec indexSpec = com.google.appengine.api.search.IndexSpec.newBuilder().setName(name).build();
    com.google.appengine.api.search.Index index = getSearchService().getIndex(indexSpec);
    return index;
}