@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState != null) {
        mEagerLoad = savedInstanceState.getBoolean(io.github.hidroh.materialistic.LazyLoadFragment.STATE_EAGER_LOAD);
    }else {
        mEagerLoad = (!(io.github.hidroh.materialistic.Preferences.shouldLazyLoad(getActivity()))) && (io.github.hidroh.materialistic.AppUtils.isOnWiFi(getContext()));
    }
}