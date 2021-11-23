private void cleanUp(java.lang.String clusterName, java.util.List<com.github.diegopacheco.dynomite.cluster.checker.parser.DynomiteNodeInfo> seeds) {
    for (com.github.diegopacheco.dynomite.cluster.checker.parser.DynomiteNodeInfo node : seeds) {
        try {
            com.netflix.dyno.jedis.DynoJedisClient cluster = com.github.diegopacheco.dynomite.cluster.checker.cluster.DynomiteClusterConnectionManager.createSingleNodeCluster(clusterName, node);
            cluster.del(DynomiteConfig.TEST_KEY);
            cluster.stopClient();
        } catch (java.lang.Exception e) {
            java.lang.System.out.println(((("Could not clean up cluster: " + clusterName) + " Node: ") + node));
        }
    }
}