@java.lang.Override
protected void bindData(android.widget.BaseAdapter adapter, java.util.List<T> data) {
    if ((adapter instanceof android.widget.ArrayAdapter) == false) {
        return ;
    }
    @java.lang.SuppressWarnings(value = "unchecked")
    android.widget.ArrayAdapter<T> objectAdapter = ((android.widget.ArrayAdapter<T>) (adapter));
    if (clearBeforeBindData()) {
        objectAdapter.clear();
    }
    if (data == null) {
        return ;
    }
    for (T o : data) {
        objectAdapter.add(o);
    }
}