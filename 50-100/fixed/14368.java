public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.util.HashMap<java.lang.String, java.lang.String> config = com.lsalab.ws2.WS2Server.parseArguments(args);
    java.util.HashMap<java.lang.String, java.lang.String> small_config = com.lsalab.ws2.WS2Server.getSmallClusterConfig(config);
    java.lang.System.out.println(config);
    java.lang.System.out.println(small_config);
    com.lsalab.ws2.WS2Server.createCluster(config, false);
    com.lsalab.ws2.WS2Server.createCluster(small_config, true);
    com.lsalab.ws2.WS2Server.buildWorkFlow(config, small_config);
    com.lsalab.ws2.WS2Server.terminateCluster(config, false);
    com.lsalab.ws2.WS2Server.terminateCluster(small_config, true);
}