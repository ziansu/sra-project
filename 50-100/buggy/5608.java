private com.spotify.heroic.model.DateRange aggregateRange(final com.spotify.heroic.model.DateRange range, final com.spotify.heroic.aggregation.Aggregation aggregation) {
    final com.spotify.heroic.model.Sampling sampling = aggregation.sampling();
    if (sampling == null)
        return range;
    
    return range.shiftStart((-(sampling.getExtent())));
}