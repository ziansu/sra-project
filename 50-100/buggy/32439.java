public void updateGPSProximityBars(double dist) {
    int progress = 100 - ((int) (java.lang.Math.round(((dist * 100.0) / 20.0))));
    if ((android.os.Build.VERSION.SDK_INT) >= 11) {
        android.animation.ObjectAnimator animation = android.animation.ObjectAnimator.ofInt(gpsProgressBar, "progress", progress);
        animation.setDuration(500);
        animation.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animation.start();
    }else
        gpsProgressBar.setProgress(progress);
    
}