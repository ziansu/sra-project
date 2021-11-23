@java.lang.Override
public void setAdapter(android.widget.ListAdapter adapter) {
    super.setAdapter(adapter);
    touchListener.resetItems();
    adapter.registerDataSetObserver(new android.database.DataSetObserver() {
        @java.lang.Override
        public void onChanged() {
            super.onChanged();
            onListChanged();
            touchListener.resetItems();
        }
    });
}