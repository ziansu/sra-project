public boolean merge(java.util.Map<java.lang.Integer, java.lang.Integer> o) {
    if (o == null) {
        return true;
    }
    if ((partial) == null) {
        this.partial = new hivemall.utils.lang.Counter<java.lang.Integer>();
    }
    partial.addAll(o);
    return true;
}