private void initRecyclerView() {
    mAdapter = new mvp.sample.biocram.samplemvp.countries.CountriesAdapter(getContext());
    mRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    mRecyclerView.setAdapter(mAdapter);
}