@java.lang.Override
public java.util.List<java.net.InetAddress> lookup(java.lang.String hostname) throws java.net.UnknownHostException {
    try {
        checkInetAddress();
        if ((((inetAddressList) != null) && ((baseHostUrl.getBaseHttpUrl()) != null)) && (android.text.TextUtils.equals(baseHostUrl.getBaseHttpUrl().host(), hostname))) {
            return inetAddressList;
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return me.ykrank.s1next.widget.hostcheck.HttpDns.SYSTEM.lookup(hostname);
}