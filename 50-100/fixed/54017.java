private void cleanUp(java.lang.String clusterName, java.util.List<com.github.diegopacheco.dynomite.cluster.checker.parser.DynomiteNodeInfo> seeds) {
    com.netflix.dyno.jedis.DynoJedisClient cluster = null;
    for (com.github.diegopacheco.dynomite.cluster.checker.parser.DynomiteNodeInfo node : seeds) {
        try {
            cluster = com.github.diegopacheco.dynomite.cluster.checker.cluster.DynomiteClusterConnectionManager.createSingleNodeCluster(clusterName, node);
            cluster.del(DynomiteConfig.TEST_KEY);
        } catch (java.lang.Exception e) {
            java.lang.System.out.println(((("Could not clean up cluster: " + clusterName) + " Node: ") + node));
        } finally {
            if (cluster != null)
                cluster.stopClient();
            
        }
    }
}