private java.lang.String getFixedAddress(java.net.InetSocketAddress fixAddress) {
    java.lang.String s = fixAddress.getAddress().toString();
    if ((s.indexOf("/")) != (-1))
        s = s.substring(((s.indexOf("/")) + 1));
    
    return s;
}