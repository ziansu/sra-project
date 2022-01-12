@java.lang.Override
public void showCleanings(java.util.ArrayList<org.letsdoitukraine.androidapp.model.Cleaning> cleanings) {
    android.support.v7.widget.LinearLayoutManager layoutManager = ((android.support.v7.widget.LinearLayoutManager) (mRecyclerView.getLayoutManager()));
    if (layoutManager == null) {
        layoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
    }
    if ((mAdapter) == null) {
        mAdapter = new org.letsdoitukraine.androidapp.adapters.ProfileCleaningsAdapter(getActivity(), cleanings);
        mRecyclerView.setAdapter(mAdapter);
    }else {
        mAdapter.updateCleanings(cleanings);
    }
}