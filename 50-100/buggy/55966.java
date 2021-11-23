@java.lang.Override
public void onRouteSelected(android.support.v7.media.MediaRouter router, android.support.v7.media.MediaRouter.RouteInfo info) {
    com.fwgg8547.mycast.Lg.d(com.fwgg8547.mycast.MainActivity.TAG, "onRouteSelected");
    mSelectedDevice = com.google.android.gms.cast.CastDevice.getFromBundle(info.getExtras());
    mCastClientListener = new com.fwgg8547.mycast.MainActivity.MyCastListener();
    com.google.android.gms.cast.Cast.CastOptions.Builder apiOptionsBuilder = Cast.CastOptions.builder(mSelectedDevice, mCastClientListener);
    mSlideshow.initialize(mContext, apiOptionsBuilder);
}