@java.lang.Override
public void run() {
    listItem = new java.util.ArrayList<>();
    com.poc.evault.utils.DocumentDataSource documentDataSource = new com.poc.evault.utils.DocumentDataSource(this);
    documentDataSource.open();
    listItem = documentDataSource.getAllDocuments();
    documentDataSource.close();
    if ((listItem.size()) >= 0) {
        mRecyclerView.setAdapter(new com.poc.evault.adapters.DocListAdapter(listItem, this, new com.poc.evault.callbacks.OnDeleteClick() {
            @java.lang.Override
            public void onDelete() {
                updateList();
            }
        }));
    }
}