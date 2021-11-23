@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mCatId = getArguments().getLong(com.hunters.pon.fragments.AddShopFollowNearestFragment.CAT_ID);
    }
    ((com.hunters.pon.activities.AddShopFollowDetailActivity) (getActivity())).mFragmentActive = this;
    mLoadMoreData = this;
    mLocationUtils = new com.hunters.pon.utils.LocationUtils();
    mLocationUtils.buildGoogleApiClient(getContext(), this, this);
    showProgressDialog(getActivity());
    checkPermission();
}