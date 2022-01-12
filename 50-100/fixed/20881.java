@java.lang.Override
public void onBackPressed() {
    if (mSearchedList) {
        mPkgInfoSearchedList.clear();
        mSearchedList = false;
        notifyDataSetChanged();
        return ;
    }else
        if ((mEdtSearch.getVisibility()) != (android.view.View.GONE)) {
            setSearchUi();
            return ;
        }
    
    super.onBackPressed();
}