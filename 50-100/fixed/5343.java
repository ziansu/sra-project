public static void main(java.lang.String[] args) {
    int bidderPort = 2223;
    java.net.InetAddress hostname = null;
    try {
        hostname = java.net.InetAddress.getLocalHost();
    } catch (java.net.UnknownHostException e1) {
        e1.printStackTrace();
    }
    client.Bidder bidder = new client.Bidder("thaleia", bidderPort, hostname);
    new java.lang.Thread(bidder).start();
}