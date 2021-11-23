public java.util.List<java.net.InetAddress> getAddressList() {
    java.net.InetAddress[] as = ((java.net.InetAddress[]) (this.addresses.toArray()));
    java.util.List<java.net.InetAddress> list = new java.util.ArrayList<>(as.length);
    for (java.net.InetAddress inetAddress : as) {
        list.add(inetAddress);
    }
    return list;
}