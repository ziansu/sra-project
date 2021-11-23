@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    butterknife.ButterKnife.bind(this, view);
    regionsRecyclerView.setHasFixedSize(true);
    regionsRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    regionAdapter = new com.northghost.afvclient.adapter.RegionListAdapter(this);
    regionsRecyclerView.setAdapter(regionAdapter);
    loadServers();
}