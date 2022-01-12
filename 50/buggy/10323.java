@java.lang.Override
public boolean hasGlyph(java.lang.String name) {
    int sid = charset.getSID(name);
    int gid = charset.getGIDForSID(sid);
    return gid != 0;
}