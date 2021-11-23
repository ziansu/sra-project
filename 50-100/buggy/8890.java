public void cfgSlaves(java.util.List<distrib.hadoop.host.Host> hosts) {
    cmds.add(cfgSlaves("cat /dev/null >"));
    cmds.add(cfgEnv((("echo '" + (distrib.hadoop.cluster.Spark.COMMENT_START)) + "' >>")));
    for (distrib.hadoop.host.Host s : hosts) {
        cmds.add(cfgSlaves((("echo " + (s.getHostName())) + " >>")));
    }
    cmds.add(cfgEnv((("echo '" + (distrib.hadoop.cluster.Spark.COMMENT_END)) + "' >>")));
}