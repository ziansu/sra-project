private void updateUI() {
    if ((mAdapter) == null) {
        android.util.Log.d(TAG, "A");
        mAdapter = new com.payforward.androidapp.post.CategoryActivity.CustomAdapter(this, com.payforward.androidapp.R.layout.category, categoryList);
        mCategoryList.setAdapter(mAdapter);
    }else {
        android.util.Log.d(TAG, "B");
        mAdapter.clear();
        mAdapter.addAll(categoryList);
        mAdapter.notifyDataSetChanged();
    }
}