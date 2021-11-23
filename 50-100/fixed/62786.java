public com.google.android.gms.ads.AdView showRemoveAds(android.app.Activity activity) {
    if ((com.rothconsulting.android.common.Utils.hasValidKey()) || (!(com.rothconsulting.android.common.Utils.isNetworkAvailable(activity, null, false)))) {
        android.widget.LinearLayout adsLayout = ((android.widget.LinearLayout) (activity.findViewById(R.id.adsLayout)));
        adsLayout.removeAllViews();
        adsLayout.setVisibility(View.GONE);
    }else {
        return showGoogleAdMobAds(activity);
    }
    return adView;
}