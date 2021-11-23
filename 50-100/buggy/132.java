public void setAdapter(android.widget.BaseAdapter adapter) {
    if (adapter == null) {
        throw new java.lang.NullPointerException("Adapter may not be null");
    }
    if (((this.adapter) != null) && ((this.dataSetObserver) != null)) {
        adapter.unregisterDataSetObserver(dataSetObserver);
    }
    this.adapter = adapter;
    this.dataSetObserver = new com.orhanobut.simplelistview.SimpleListView.AdapterDataSetObserver();
    this.adapter.registerDataSetObserver(dataSetObserver);
    resetList();
    refreshList();
}