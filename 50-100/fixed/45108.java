private static int createUniqueIdentifier() {
    try {
        java.net.InetAddress address = net.weweave.tubewarder.util.SystemIdentifier.getLocalAddress();
        return java.util.Arrays.hashCode(address.getAddress());
    } catch (java.lang.Exception e) {
        return java.util.concurrent.ThreadLocalRandom.current().nextInt();
    }
}