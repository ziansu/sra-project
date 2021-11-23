@java.lang.Override
public void removeSelectionInterval(int index0, int index1) {
    super.removeSelectionInterval(index0, index1);
    java.util.Set<T> proxies = sel_model.getSelected();
    for (int i = index0; i <= index1; i++) {
        T proxy = model.getProxy(i, false);
        if (proxy != null)
            proxies.remove(proxy);
        
    }
    setSelected(proxies);
}