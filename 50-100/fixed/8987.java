@java.lang.Override
public void onAdFailedToLoad(int error) {
    android.util.Log.d(com.samcodes.admob.BannerListener.TAG, "onBannerFailedToLoad");
    android.util.Log.d(com.samcodes.admob.BannerListener.TAG, ("Hiding banner with id " + (id)));
    com.samcodes.admob.AdView view = com.samcodes.admob.AdMobExtension.getBannerViewForUnitId(id);
    view.setVisibility(View.INVISIBLE);
    com.samcodes.admob.AdMobExtension.getLayout().removeView(view);
    com.samcodes.admob.AdMobExtension.getLayout().bringToFront();
    com.samcodes.admob.AdMobExtension.callHaxe("onBannerFailedToLoad", new java.lang.Object[]{ id });
}