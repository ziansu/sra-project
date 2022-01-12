protected void enumerationCompleteSwing(java.util.Collection<T> proxies) {
    indices.clear();
    for (T proxy : proxies) {
        if (check(proxy))
            list.add(proxy);
        
    }
    int sz = (list.size()) - 1;
    if (sz >= 0) {
        us.mn.state.dot.tms.client.proxy.ProxyListModel.Filter<T> f = getFilter();
        setFilter(null);
        fireIntervalAdded(this, 0, sz);
        setFilter(f);
    }
}