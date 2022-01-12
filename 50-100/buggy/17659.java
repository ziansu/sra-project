@java.lang.Override
public void onConnectionOk() {
    mDomoticz = new nl.hnogames.domoticz.Domoticz.Domoticz(getActivity());
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (getView().findViewById(R.id.my_recycler_view)));
    mRecyclerView.setHasFixedSize(true);
    android.support.v7.widget.GridLayoutManager mLayoutManager = new android.support.v7.widget.GridLayoutManager(getActivity(), 2);
    mRecyclerView.setLayoutManager(mLayoutManager);
    getCameras();
}