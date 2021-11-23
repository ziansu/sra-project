public final void fireValueChanged(java.lang.String key, java.lang.Object value, java.lang.Object oldValue) {
    for (at.netcrawler.network.model.NetworkModelListener listener : listeners) {
        listener.valueChanged(key, value, oldValue);
    }
}