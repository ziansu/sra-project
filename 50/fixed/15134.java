@java.lang.Override
public void onFailure(final java.lang.Throwable throwable) {
    se.tre.freki.storage.cassandra.search.CassandraSearchPlugin.LOG.error("Search for ngram {} of type {} failed", ngram, type);
}