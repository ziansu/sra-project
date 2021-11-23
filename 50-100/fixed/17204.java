private void setupNavigationList() {
    android.widget.ArrayAdapter<java.lang.String> navAdapter = new com.android.contacts.activities.ActionBarAdapter.CustomArrayAdapter(mContext, R.layout.people_navigation_item);
    navAdapter.add(mContext.getString(R.string.contactsFavoritesLabel));
    navAdapter.add(mContext.getString(R.string.contactsAllLabel));
    navAdapter.add(mContext.getString(R.string.contactsGroupsLabel));
    mActionBar.setListNavigationCallbacks(navAdapter, mNavigationListener);
}