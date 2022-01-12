@java.lang.Override
public org.ccnx.ccn.io.CCNFileInputStream getCCNFile(java.lang.String contentName) {
    try {
        java.lang.System.out.println(("getCCNFile:" + contentName));
        org.ccnx.ccn.protocol.ContentName cn = org.ccnx.ccn.protocol.ContentName.fromURI(contentName);
        org.ccnx.ccn.io.CCNFileInputStream cis = new org.ccnx.ccn.io.CCNFileInputStream(cn, ccnHandle);
        return cis;
    } catch (org.ccnx.ccn.protocol.MalformedContentNameStringException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}