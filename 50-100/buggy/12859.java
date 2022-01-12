@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mActivityContext = getActivity();
    mApplicationContext = getActivity().getApplicationContext();
    if ((getArguments()) != null) {
        mCategoryName = getArguments().getString(com.pratilipi.mobile.android.PratilipiList.PratilipiListFragment.CATEGORY_NAME);
        mCategoryFilters = getArguments().getString(com.pratilipi.mobile.android.PratilipiList.PratilipiListFragment.CATEGORY_FILTER);
        mSearchQuery = getArguments().getString(com.pratilipi.mobile.android.PratilipiList.PratilipiListFragment.SEARCH_QUERY);
    }
    mUserActionListner = new com.pratilipi.mobile.android.PratilipiList.PratilipiListPresenter(mActivityContext, this);
    mPratilipiListAdapter = new com.pratilipi.mobile.android.PratilipiList.PratilipiListAdapter(mApplicationContext, this, mSearchQuery);
}