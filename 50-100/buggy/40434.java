@java.lang.Override
public org.ccnx.ccn.io.RepositoryFileOutputStream putRepoFile(java.lang.String contentname) {
    try {
        org.ccnx.ccn.protocol.ContentName cn = org.ccnx.ccn.protocol.ContentName.fromURI(contentname);
        org.ccnx.ccn.io.RepositoryFileOutputStream ros = new org.ccnx.ccn.io.RepositoryFileOutputStream(cn, ccnHandle);
    } catch (org.ccnx.ccn.protocol.MalformedContentNameStringException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}