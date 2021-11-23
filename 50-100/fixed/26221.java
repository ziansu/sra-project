@java.lang.Override
public void onNewClusterRead(uk.ac.ebi.pride.spectracluster.clusteringfilereader.objects.ICluster newCluster) {
    uk.ac.ebi.pride.spectracluster.statistics.stat.ClusterStatistics clusterStatistics = clusterStatisticsCollector.collect(((uk.ac.ebi.pride.spectracluster.clusteringfilereader.objects.ClusteringFileCluster) (newCluster)));
    if (clusterFilter.apply(clusterStatistics)) {
        overallClusterStatisticsCollector.collect(((uk.ac.ebi.pride.spectracluster.clusteringfilereader.objects.ClusteringFileCluster) (newCluster)));
        clusterStatisticsReporter.report(clusterStatistics);
    }
}