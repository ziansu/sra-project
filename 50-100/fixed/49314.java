@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (((mMainFragment) != null) && (mx.evin.udacity.popularmovies.utils.NetworkMagic.isNetworkAvailable(mMainFragment.getActivity()))) {
        if (mMainFragment.isActuallyEmpty()) {
            mMainFragment.getActivityCallback().onEmptyResults();
        }
    }
}