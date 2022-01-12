@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mRepository = new pt.ipp.estg.cmu.db.repositories.NivelRepo(getContext());
    mNiveis = getAllNiveis();
    mAdapter = new pt.ipp.estg.cmu.adapters.AdapterLevelList(getActivity(), mNiveis, mCategoria, isAdmin);
    mRecyclerView.setAdapter(mAdapter);
    if (isAdmin) {
        pt.ipp.estg.cmu.callbacks.RecyclerSwipeNivelTouchHelper swipeTouch = new pt.ipp.estg.cmu.callbacks.RecyclerSwipeNivelTouchHelper(0, android.support.v7.widget.helper.ItemTouchHelper.RIGHT, getContext(), mRecyclerView, mNiveis, mAdapter);
        android.support.v7.widget.helper.ItemTouchHelper itemTouchHelper = new android.support.v7.widget.helper.ItemTouchHelper(swipeTouch);
        itemTouchHelper.attachToRecyclerView(mRecyclerView);
    }
}