public final int copyInt(org.giiwa.core.bean.Bean.V v, java.lang.String... names) {
    if (((v == null) || (names == null)) || ((names.length) == 0))
        return 0;
    
    int count = 0;
    for (java.lang.String name : names) {
        int s = org.giiwa.core.bean.Bean.toInt(this.getString(name));
        v.set(name, s);
        count++;
    }
    return count;
}