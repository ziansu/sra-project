@java.lang.Override
public void run() {
    plugInBlender();
    bannerWrapper = new android.widget.RelativeLayout(cordova.getActivity());
    bannerWrapper.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    bannerWrapper.setVisibility(View.INVISIBLE);
    android.widget.RelativeLayout.LayoutParams bannerLayout = new android.widget.RelativeLayout.LayoutParams(dips(RevMobBanner.DEFAULT_WIDTH_IN_DIP), dips(RevMobBanner.DEFAULT_HEIGHT_IN_DIP));
    bannerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
    banner.setLayoutParams(bannerLayout);
    bannerWrapper.addView(banner);
    blender.addView(bannerWrapper);
}