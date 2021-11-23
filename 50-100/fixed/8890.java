public void cfgSlaves(java.util.List<distrib.hadoop.host.Host> hosts) {
    cmds.add(cfgSlaves("cat /dev/null >"));
    for (distrib.hadoop.host.Host s : hosts) {
        cmds.add(cfgSlaves((("echo " + (s.getHostName())) + " >>")));
    }
}