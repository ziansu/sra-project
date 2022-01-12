public void fillRecyclerView(int primaryResource, int emptyResource, java.util.ArrayList<zollie.travelblogger.guidee.models.EventModel> eventModels) {
    android.support.v7.widget.RecyclerView rvEvents = ((android.support.v7.widget.RecyclerView) (findViewById(primaryResource)));
    rvEvents.setNestedScrollingEnabled(false);
    zollie.travelblogger.guidee.adapters.EventAdapter adapter = new zollie.travelblogger.guidee.adapters.EventAdapter(this, eventModels);
    rvEvents.setAdapter(adapter);
    rvEvents.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this, android.support.v7.widget.LinearLayoutManager.VERTICAL, false));
    android.support.v7.widget.RecyclerView.ItemDecoration itemDecoration = new android.support.v7.widget.DividerItemDecoration(this, android.support.v7.widget.DividerItemDecoration.VERTICAL_LIST);
    rvEvents.addItemDecoration(itemDecoration);
}