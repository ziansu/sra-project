private boolean isInternetAvailable() {
    try {
        final java.net.InetAddress address = java.net.InetAddress.getByName("www.google.com");
        if (!(address.equals(""))) {
            return true;
        }
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    }
    return false;
}