private static int createUniqueIdentifier() {
    try {
        java.net.InetAddress address = net.weweave.tubewarder.util.SystemIdentifier.getLocalAddress();
        int hash = java.util.Arrays.hashCode(address.getAddress());
        return hash;
    } catch (java.lang.Exception e) {
        return java.util.concurrent.ThreadLocalRandom.current().nextInt();
    }
}