java.lang.Integer getGIDForSID(int sid) {
    if (isCIDFont) {
        throw new java.lang.IllegalStateException("Not a Type 1-equivalent font");
    }
    java.lang.Integer gid = sidOrCidToGid.get(sid);
    return gid;
}