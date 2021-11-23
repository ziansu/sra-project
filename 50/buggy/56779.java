public java.lang.String getIP(java.lang.String ip) {
    try {
        ip = java.net.InetAddress.getLocalHost().getHostAddress();
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    }
    return ip;
}