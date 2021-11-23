@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mUserLearnedDrawer = com.aspsine.zhihu.daily.util.SharedPrefUtils.isUserLearnedDrawer(getActivity());
    if (savedInstanceState != null) {
        mCurrentSelectedPosition = savedInstanceState.getInt(com.aspsine.zhihu.daily.ui.fragment.NavigationFragment.STATE_SELECTED_POSITION);
        mFromSavedInstanceState = true;
    }
    mThemes = new java.util.ArrayList<com.aspsine.zhihu.daily.model.Theme>();
    mAdapter = new com.aspsine.zhihu.daily.ui.adapter.NavigationDrawerAdapter(mThemes);
    mAdapter.setNavigationDrawerCallbacks(this);
}