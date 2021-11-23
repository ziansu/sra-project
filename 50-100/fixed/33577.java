public java.lang.String getFixedAddress(java.net.InetAddress fixAddress) {
    java.lang.String s = fixAddress.toString();
    if ((s.indexOf("/")) != (-1))
        s = s.substring(((s.indexOf("/")) + 1));
    
    return s;
}