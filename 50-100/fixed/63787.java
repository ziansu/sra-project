protected void enumerationCompleteSwing(java.util.Collection<T> proxies) {
    for (T proxy : proxies) {
        if (check(proxy))
            list.add(proxy);
        
    }
    int sz = (list.size()) - 1;
    if (sz >= 0) {
        fireIntervalAdded(this, 0, sz);
    }
}