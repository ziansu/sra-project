public final int rebound(java.lang.String... names) {
    int count = 0;
    if ((names != null) && ((names.length) > 0)) {
        for (java.lang.String name : names) {
            set(name, this.getString(name));
            count++;
        }
    }else {
        for (java.lang.String name : this.getNames()) {
            set(name, this.getString(name));
            count++;
        }
    }
    return count;
}