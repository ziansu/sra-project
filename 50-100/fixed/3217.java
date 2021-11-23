public void setAdapter(android.support.v4.view.PagerAdapter adapter) {
    if ((this.adapter) != null) {
        this.adapter.unregisterDataSetObserver(adapterObserver);
    }
    this.adapter = adapter;
    if ((this.adapter) != null) {
        this.adapter.registerDataSetObserver(adapterObserver);
    }
}