public long ipToLong(java.lang.String ipString) {
    long ipLong = 0;
    long ip;
    java.lang.String[] ipArray = ipString.split("\\.");
    for (int i = 3; i >= 0; i--) {
        ip = java.lang.Long.parseLong(ipArray[(3 - i)]);
        ipLong |= ip << (i * 8);
    }
    return ipLong;
}