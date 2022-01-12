public java.lang.String getIP() {
    try {
        return java.net.InetAddress.getLocalHost().getHostAddress();
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    }
    return null;
}