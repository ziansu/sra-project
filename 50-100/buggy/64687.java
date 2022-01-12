public eu.aliada.rdfizer.pipeline.format.marc.frbr.cluster.Cluster getTitleCluster(final java.lang.String heading) throws java.sql.SQLException {
    eu.aliada.rdfizer.pipeline.format.marc.frbr.cluster.Cluster cluster = cachedTitleClusters.get(heading);
    if (cluster == null) {
        cluster = loadTitleCluster(heading);
        if (cluster != null) {
            cachedNameClusters.put(heading, cluster);
        }else {
            return new eu.aliada.rdfizer.pipeline.format.marc.frbr.cluster.FakeCluster(heading);
        }
    }
    return cluster;
}