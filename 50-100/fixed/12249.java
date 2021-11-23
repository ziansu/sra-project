public long ipToLong(java.lang.String ipString) {
    long ipLong = 0;
    long ip;
    java.lang.String[] ipArray = ipString.split("\\.");
    int length = (ipArray.length) - 1;
    for (int i = length; i >= 0; i--) {
        ip = java.lang.Long.parseLong(ipArray[(length - i)]);
        ipLong |= ip << (i * 8);
    }
    return ipLong;
}