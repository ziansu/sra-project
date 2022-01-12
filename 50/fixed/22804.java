public void pauseDrawState(boolean flag) {
    pasuseCurrentVideo(flag);
    if (flag) {
        mMapView.onPause();
    }else {
        mMapView.onResume();
        bringChildToFront(mMapView);
    }
}