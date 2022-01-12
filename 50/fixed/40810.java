@java.lang.Override
public void onRouteUnselected(android.support.v7.media.MediaRouter router, android.support.v7.media.MediaRouter.RouteInfo info) {
    com.fwgg8547.mycast.Lg.i(com.fwgg8547.mycast.MainActivity.TAG, ("onRouteUnselected: info=" + info));
    mSelectedDevice = null;
    mCastClientListener = null;
    mSlideshow.finalize();
}