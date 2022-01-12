@java.lang.Override
public boolean onMenuItemActionExpand(android.view.MenuItem item) {
    android.widget.Toast.makeText(mContext, "Search view's been clicked", Toast.LENGTH_SHORT).show();
    mCurrentGridFragment = getSupportFragmentManager().findFragmentById(R.id.fragment_main_container);
    mSearchResultFragment = com.quartzodev.fragments.SearchResultFragment.newInstance(mUser.getUid(), mFolderId);
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.fragment_main_container, mSearchResultFragment).commit();
    transaction.addToBackStack(null);
    return true;
}