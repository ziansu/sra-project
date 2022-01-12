@java.lang.Override
public void addSelectionInterval(int index0, int index1) {
    super.addSelectionInterval(index0, index1);
    java.util.Set<T> proxies = sel_model.getSelected();
    for (int i = index0; i <= index1; i++) {
        T proxy = model.getProxy(i);
        if (proxy != null)
            proxies.add(proxy);
        
    }
    setSelected(proxies);
}