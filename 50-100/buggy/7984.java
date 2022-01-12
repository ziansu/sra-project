public org.giiwa.core.bean.Helper.V copy(java.util.Map<java.lang.String, java.lang.Object> jo, java.lang.String... names) {
    if ((jo == null) || (names == null))
        return this;
    
    for (java.lang.String s : names) {
        if (jo.containsKey(s)) {
            java.lang.Object o = jo.get(s);
            if (org.giiwa.core.bean.X.isEmpty(o)) {
                set(s, X.EMPTY);
            }else {
                set(s, o);
            }
        }
    }
    return this;
}