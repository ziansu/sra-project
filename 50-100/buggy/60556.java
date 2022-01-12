@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (savedInstanceState == null) {
        recycler.setLayoutManager(provideLayoutManager());
        adapter = provideAdapter(java.util.Collections.EMPTY_LIST);
        recycler.setAdapter(adapter);
        android.support.v7.widget.RecyclerView.ItemDecoration itemDecoration = provideItemDecoration();
        if (itemDecoration != null) {
            recycler.addItemDecoration(itemDecoration);
        }
        dataObserver = new uk.co.jamiecruwys.StatefulDataObserver(adapter, this);
    }
}