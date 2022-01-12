public final int copyDate(org.giiwa.core.bean.Bean.V v, java.lang.String format, java.lang.String... names) {
    if (((v == null) || (names == null)) || ((names.length) == 0))
        return 0;
    
    int count = 0;
    for (java.lang.String name : names) {
        long s = lang.parse(this.getString(name), format);
        if (s > 0) {
            v.set(name, s);
            count++;
        }
    }
    return count;
}