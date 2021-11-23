@java.lang.Override
protected boolean pollDirectory(java.lang.String fileName, java.util.List list, int depth) {
    if ((remaining) != null) {
        java.lang.String sha1 = org.apache.commons.codec.digest.DigestUtils.sha1Hex(remaining);
        initialize(remaining, sha1);
        return doPoll(sha1);
    }
    return false;
}