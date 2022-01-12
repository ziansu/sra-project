private java.lang.String getFixedAddress(java.net.InetSocketAddress fixAddress) {
    java.lang.String s = fixAddress.getAddress().toString();
    if (!(s.equals("localhost/127.0.0.1")))
        s = s.substring(((s.indexOf("/")) + 1));
    else
        s = "localhost";
    
    return s;
}