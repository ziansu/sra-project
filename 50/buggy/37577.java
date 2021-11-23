@java.lang.Override
protected java.util.Properties get(java.lang.String key) {
    int mc = reloadModCount;
    if ((modCount) != mc) {
        this.clearCache();
        modCount = mc;
    }
    return super.get(key);
}