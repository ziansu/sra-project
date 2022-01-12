private void populate() {
    junit.framework.Assert.assertNotNull(service);
    if ((adapter) != null) {
        return ;
    }
    adapter = new agersant.polaris.features.queue.QueueAdapter(service);
    android.support.v7.widget.helper.ItemTouchHelper.Callback callback = new agersant.polaris.features.queue.QueueTouchCallback(adapter);
    android.support.v7.widget.helper.ItemTouchHelper itemTouchHelper = new android.support.v7.widget.helper.ItemTouchHelper(callback);
    itemTouchHelper.attachToRecyclerView(recyclerView);
    recyclerView.setAdapter(adapter);
}