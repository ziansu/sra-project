@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((uz.samtuit.samapp.util.GPSSettingDialog.checkGPSStatus(this)) != 0) {
        myLocationOverlay.enableMyLocation();
        myLocationOverlay.setDrawAccuracyEnabled(true);
        mapView.getOverlays().add(myLocationOverlay);
        if (uz.samtuit.samapp.main.MainMap.isPressedMyPosBtn) {
            anim = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.scale);
            mAnimMyPosImage.startAnimation(anim);
        }
    }else {
        mAnimMyPosImage.clearAnimation();
    }
}