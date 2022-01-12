public static int IPToInteger(java.lang.String ipstr) {
    int result = 0;
    java.lang.String[] addresses = ipstr.split("\\.");
    for (int i = 3; i >= 0; i--) {
        int ip = java.lang.Integer.parseInt(addresses[i]);
        result |= ip << (i * 8);
    }
    return result;
}