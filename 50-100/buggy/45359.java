private void refreshRecyclerView() {
    if ((mDao) == null)
        mDao = new ve.com.abicelis.remindy.database.RemindyDAO(getApplicationContext());
    
    mPlaces.clear();
    mPlaces.addAll(mDao.getPlaces());
    mAdapter.notifyDataSetChanged();
    if ((mPlaces.size()) == 0) {
        mNoItemsContainer.setVisibility(View.VISIBLE);
        mRecyclerView.setVisibility(View.GONE);
    }else {
        mRecyclerView.setItemViewCacheSize(View.VISIBLE);
        mNoItemsContainer.setVisibility(View.GONE);
    }
}