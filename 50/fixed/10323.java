@java.lang.Override
public boolean hasGlyph(java.lang.String name) {
    int sid = charset.getSID(name);
    java.lang.Integer gid = charset.getGIDForSID(sid);
    if (gid == null) {
        return false;
    }else {
        return true;
    }
}