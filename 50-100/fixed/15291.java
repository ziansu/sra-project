@java.lang.Override
public void setSelectionInterval(int index0, int index1) {
    super.setSelectionInterval(index0, index1);
    java.util.HashSet<T> proxies = new java.util.HashSet<T>();
    for (int i = index0; i <= index1; i++) {
        T proxy = model.getProxy(i, false);
        if (proxy != null)
            proxies.add(proxy);
        
    }
    setSelected(proxies);
}