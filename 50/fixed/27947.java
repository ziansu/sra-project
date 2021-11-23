@java.lang.Override
public com.spotify.heroic.aggregation.Session session(java.lang.Class<?> out, com.spotify.heroic.model.DateRange range) {
    return new com.spotify.heroic.aggregation.GroupingAggregation.GroupSession(output(), range);
}