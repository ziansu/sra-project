private void refreshRecyclerView() {
    if ((mDao) == null)
        mDao = new ve.com.abicelis.remindy.database.RemindyDAO(getApplicationContext());
    
    mPlaces.clear();
    mPlaces.addAll(mDao.getPlaces());
    if ((mPlaces.size()) == 0) {
        mNoItemsContainer.setVisibility(View.VISIBLE);
        mRecyclerView.setVisibility(View.GONE);
    }else {
        mRecyclerView.setVisibility(View.VISIBLE);
        mNoItemsContainer.setVisibility(View.GONE);
        mAdapter.notifyDataSetChanged();
    }
}