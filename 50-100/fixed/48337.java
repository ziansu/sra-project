public final java.lang.String getCookie(java.lang.String name) {
    org.giiwa.framework.web.Cookie[] cc = getCookie();
    if (cc != null) {
        for (int i = (cc.length) - 1; i >= 0; i--) {
            org.giiwa.framework.web.Cookie c = cc[i];
            if (c.getName().equals(name)) {
                return c.getValue();
            }
        }
    }
    return null;
}