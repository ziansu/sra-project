private void setRecyclerView() {
    mViewModel.setRestaurantListVisible(true);
    mAdapter = new com.huhx0015.doordashchallenge.view.adapters.RestaurantListAdapter(mRestaurantList, this, getContext());
    mAdapter.setHasStableIds(true);
    mBinding.fragmentRestaurantRecyclerView.setAdapter(mAdapter);
}