@java.lang.Override
public boolean onScale(android.view.ScaleGestureDetector detector) {
    scale *= detector.getScaleFactor();
    scale = java.lang.Math.max(0.2F, java.lang.Math.min(scale, 3.0F));
    android.util.Log.i(ca.sapphire.schview.SchViewActivity.TAG, ("Scale: " + (scale)));
    return true;
}