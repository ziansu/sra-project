@java.lang.Override
protected void onStart() {
    super.onStart();
    if (!(mLocationClient.isStarted()))
        mLocationClient.start();
    
    if (com.avos.avoscloud.AVUser.getCurrentUser().getBoolean("isShareSignInfo")) {
        com.wenjiehe.xingji.Activity.NearbyMomentsActivity.arraylistNearbyMoments.clear();
    }
}