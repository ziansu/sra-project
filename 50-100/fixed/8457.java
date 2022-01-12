private void initRecyclerView(android.view.View view) {
    android.util.Log.d(com.example.andrew.prokhor.eyecare.ui.fragments.MainFragment.LOG_TAG, "initRecyclerView()");
    mAdapter = new com.example.andrew.prokhor.eyecare.ui.adapters.ExpandableCursorRecyclerViewAdapter(getActivity(), this);
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.logsRecyclerView)));
    mRecyclerView.setAdapter(mAdapter);
    mRecyclerView.setLayoutManager(layoutManager);
    android.support.v7.widget.helper.ItemTouchHelper.Callback callback = new com.example.andrew.prokhor.eyecare.ui.adapters.ExpandableCursorItemTouchHelperCallback(mAdapter);
    android.support.v7.widget.helper.ItemTouchHelper touchHelper = new android.support.v7.widget.helper.ItemTouchHelper(callback);
    touchHelper.attachToRecyclerView(mRecyclerView);
}