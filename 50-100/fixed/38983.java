public void updateHeader(java.lang.String name, java.lang.String value) {
    if (hasHeader(name)) {
        java.util.ArrayList<java.lang.String> hdrs = getHeaders(name);
        if (hdrs == null) {
            addHeader(name, value);
            return ;
        }
        hdrs.clear();
        hdrs.add(value);
    }else {
        addHeader(name, value);
    }
}