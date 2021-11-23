@java.lang.Override
public void onBackPressed() {
    if (mSearchedList) {
        mPkgInfoSearchedList.clear();
        mSearchedList = false;
        android.widget.BaseAdapter tmpAdapter = ((android.widget.BaseAdapter) (getListAdapter()));
        if (tmpAdapter != null) {
            tmpAdapter.notifyDataSetChanged();
        }
        return ;
    }else
        if ((mEdtSearch.getVisibility()) != (android.view.View.GONE)) {
            setSearchUi();
            return ;
        }
    
    super.onBackPressed();
}