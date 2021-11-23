@java.lang.Override
public java.lang.Iterable<T> query(final org.structr.api.search.QueryPredicate predicate) {
    final org.structr.bolt.index.CypherQuery query = new org.structr.bolt.index.CypherQuery(this);
    createQuery(this, predicate, query, true);
    final java.lang.String sortKey = predicate.getSortKey();
    if (sortKey != null) {
        query.sort(predicate.getSortType(), sortKey, predicate.sortDescending());
    }
    return getResult(query);
}