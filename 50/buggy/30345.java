@java.lang.Override
public boolean verify(java.lang.String hostname, javax.net.ssl.SSLSession sslSession) {
    if (hostname.equals("hl7v2.gvt.nist.gov")) {
        return true;
    }
    return false;
}