@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(mx.evin.udacity.popularmovies.receivers.NetworkReceiver.TAG, ("onReceive: " + (intent.getAction())));
    if (((mMainFragment) != null) && (mx.evin.udacity.popularmovies.utils.NetworkMagic.isNetworkAvailable(mMainFragment.getActivity()))) {
        if (mMainFragment.isActuallyEmpty()) {
            mMainFragment.getActivityCallback().onEmptyResults();
        }
    }
}