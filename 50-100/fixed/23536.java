@java.lang.Override
public io.seldon.clustering.recommender.ClustersCounts retrieve() throws java.lang.Exception {
    io.seldon.clustering.recommender.CountRecommender.logger.info(((("Trying to get top counts for tag and dimension from db : testMode is for client " + (client)) + " dimension:") + dimension));
    java.util.Map<java.lang.Long, java.lang.Double> itemMap = clusterCounts.getTopCountsByTagAndDimension(tag, tagAttrId, dimension, limit, decay);
    return new io.seldon.clustering.recommender.ClustersCounts(itemMap, 0);
}