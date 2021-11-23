public java.lang.String getFixedAddress(java.net.InetAddress fixAddress) {
    java.lang.String s = fixAddress.toString();
    if (s.equals("localhost/127.0.0.1"))
        s = "localhost";
    
    if ((s.indexOf("/")) != (-1))
        s = s.substring(((s.indexOf("/")) + 1));
    
    return s;
}