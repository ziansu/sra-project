public java.lang.String tIpv6address() {
    try {
        java.lang.String hostName = java.lang.String.valueOf(buffer, ptr, ((buffer.length) - (ptr)));
        gov.nist.core.HostNameParser hnp = new gov.nist.core.HostNameParser(hostName);
        gov.nist.core.HostPort hp = hnp.hostPort(true);
        int length = hp.getHost().hostname.length();
        consume(length);
        return hp.getHost().hostname;
    } catch (java.text.ParseException ex) {
        return null;
    }
}