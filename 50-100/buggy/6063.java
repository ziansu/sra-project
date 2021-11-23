public javax.mail.internet.InternetAddress[] getGroup(boolean strict) throws javax.mail.internet.AddressException {
    java.lang.String addr = getAddress();
    if (!(addr.endsWith(";")))
        return null;
    
    int ix = addr.indexOf(':');
    if (ix < 0)
        return null;
    
    java.lang.String list = addr.substring((ix + 1), ((addr.length()) - 1));
    return javax.mail.internet.InternetAddress.parseHeader(list, strict);
}