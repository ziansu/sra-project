public static int getClusterID(java.lang.String ipAddress, int port, int no_clusters) {
    int result = ipAddress.hashCode();
    result = (31 * result) + port;
    return result % no_clusters;
}