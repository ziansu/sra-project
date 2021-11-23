@java.lang.Override
public void onLongClick(android.view.View view, int position) {
    mCategory = mCategoriesList.get(position);
    mCallback.onCategorySelected(mCategory);
}