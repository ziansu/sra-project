@java.lang.Override
public java.lang.Object getResult(java.lang.String joinId) {
    if (joinId.equals(missingId)) {
        return null;
    }
    return new org.apache.solr.search.xjoin.SimpleXJoinResultsFactory.Result(joinId, 0.5);
}