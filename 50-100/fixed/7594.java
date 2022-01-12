private void updateUI() {
    if ((mAdapter) == null) {
        mAdapter = new com.payforward.androidapp.post.CategoryActivity.CustomAdapter(this, com.payforward.androidapp.R.layout.category, categoryList);
        mCategoryList.setAdapter(mAdapter);
    }else {
        mAdapter.clear();
        mAdapter.addAll(categoryList);
        mAdapter.notifyDataSetChanged();
    }
}