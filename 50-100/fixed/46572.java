@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ((newText.length()) >= 0) {
        mUsersList.setVisibility(View.VISIBLE);
        mUsersAdapter.getFilter().filter(newText);
    }else {
        mUsersList.setVisibility(View.GONE);
    }
    return false;
}