protected final int getInt(java.lang.String tag, int minValue, java.lang.String tagInSession) {
    int r = getInt(tag);
    if (r < minValue) {
        org.giiwa.framework.web.Session s = this.getSession();
        r = s.getInt(tagInSession);
        if (r < minValue) {
            r = org.giiwa.core.conf.Global.i(tagInSession, minValue);
        }
    }else {
        org.giiwa.framework.web.Session s = this.getSession();
        s.set(tagInSession, r).store();
    }
    return r;
}