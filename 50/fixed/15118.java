@java.lang.Override
public void refresh(java.lang.String indexName) {
    execute(new io.searchbox.indices.Refresh.Builder().addIndex(indexName).build());
}