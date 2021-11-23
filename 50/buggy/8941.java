private int scanServers(java.util.Map<org.apache.hadoop.fs.Path, java.lang.String> fileToServerMap, java.util.Map<java.lang.String, org.apache.hadoop.fs.Path> nameToFileMap) throws java.lang.Exception {
    return scanServers(org.apache.accumulo.server.ServerConstants.getWalDirs(), fileToServerMap, nameToFileMap);
}