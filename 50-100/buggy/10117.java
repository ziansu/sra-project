@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if ((mSessionManager.getIsPurchased()) == (com.aftersapp.utils.AppConstants.ITEM_NOT_PURCHASED))
        com.aftersapp.AftersAppApplication.getInstance().setAddClickCount();
    
    if (id == (R.id.action_filter)) {
        com.aftersapp.fragments.FilterFragment filterFragment = new com.aftersapp.fragments.FilterFragment();
        getFragmentManager().beginTransaction().replace(R.id.fragment_frame_lay, filterFragment, "FilterFragment").commit();
        return true;
    }
    return super.onOptionsItemSelected(item);
}