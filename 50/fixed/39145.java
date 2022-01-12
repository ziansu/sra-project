public static int getClusterID(java.lang.String ipAddress, int port, int no_clusters) {
    int result = ipAddress.hashCode();
    result = (31 * result) + port;
    return java.lang.Math.abs((result % no_clusters));
}