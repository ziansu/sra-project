@java.lang.Override
public void execute(org.apache.storm.tuple.Tuple input, org.apache.storm.topology.BasicOutputCollector collector) {
    diploma.bolts.denstream.DenStreamStatisticsBolt.statisticsCounter += 5;
    java.sql.Timestamp time = new java.sql.Timestamp(new java.util.Date().getTime());
    java.util.List<diploma.clustering.clusters.Cluster<diploma.clustering.clusters.StatusesCluster>> macroClusters = ((java.util.List<diploma.clustering.clusters.Cluster<diploma.clustering.clusters.StatusesCluster>>) (input.getValue(0)));
    for (diploma.clustering.clusters.Cluster<diploma.clustering.clusters.StatusesCluster> cluster : macroClusters)
        macroClusteringStatisticsDao.saveStatistics(getClusterStatistics(cluster, time));
    
}