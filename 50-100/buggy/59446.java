@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    com.polaron.placeholder.RecyclerListAdapter adapter = new com.polaron.placeholder.RecyclerListAdapter(getActivity(), this, this);
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (view));
    recyclerView.setHasFixedSize(true);
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    android.support.v7.widget.helper.ItemTouchHelper.Callback callback = new com.polaron.placeholder.helper.SimpleItemTouchHelperCallback(adapter);
    mItemTouchHelper = new android.support.v7.widget.helper.ItemTouchHelper(callback);
    mItemTouchHelper.attachToRecyclerView(recyclerView);
}