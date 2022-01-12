private static float getScaleFactor() {
    android.util.DisplayMetrics metrics = new android.util.DisplayMetrics();
    io.gloop.drawed.utils.ScreenUtil.activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
    float factor1 = (metrics.heightPixels) / 1920.0F;
    float factor2 = (metrics.widthPixels) / 1080.0F;
    if (factor1 >= factor2)
        return factor1;
    else
        return factor2;
    
}