public java.util.List<java.net.InetAddress> getAddressList() {
    if ((this.addresses.size()) == 0)
        return new java.util.ArrayList<>();
    
    java.net.InetAddress[] as = this.addresses.toArray(new java.net.InetAddress[0]);
    java.util.List<java.net.InetAddress> list = new java.util.ArrayList<>(as.length);
    for (java.net.InetAddress inetAddress : as) {
        list.add(inetAddress);
    }
    return list;
}