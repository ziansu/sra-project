@java.lang.Override
public boolean onMenuItemActionExpand(android.view.MenuItem item) {
    android.widget.Toast.makeText(mContext, "Search view's been clicked", Toast.LENGTH_SHORT).show();
    mSearchResultFragment = com.quartzodev.fragments.SearchResultFragment.newInstance(mUser.getUid(), mFolderId, null);
    mSearchResultFragment.setRetainInstance(true);
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.fragment_main_container, mSearchResultFragment).commit();
    mSearchView.requestFocus();
    return true;
}