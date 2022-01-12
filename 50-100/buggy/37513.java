public static void init(java.lang.String configFile) {
    try {
        java.net.InetAddress addr = java.net.InetAddress.getLocalHost();
        org.radargun.cachewrappers.DCManager.localIp = addr.getHostAddress();
        org.radargun.cachewrappers.DCManager.log.warn(("Local Ip is " + (org.radargun.cachewrappers.DCManager.localIp)));
        org.radargun.cachewrappers.DCManager.localConnection = new org.radargun.cachewrappers.AntidoteConnection(org.radargun.cachewrappers.DCManager.localIp);
        org.radargun.cachewrappers.DCManager.getHashFun();
        org.radargun.cachewrappers.DCManager.nodeIndex = org.radargun.cachewrappers.DCManager.allNodes.indexOf(org.radargun.cachewrappers.DCManager.localIp);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        java.lang.System.exit(0);
    }
}