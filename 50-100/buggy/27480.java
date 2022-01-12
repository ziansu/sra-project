private java.lang.Process runServerProcess(int tcpPort, int udpPort) {
    java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder("java", "-jar", serverJarPath, java.lang.String.valueOf(tcpPort), java.lang.String.valueOf(udpPort));
    try {
        java.lang.Process p = pb.start();
        return p;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}