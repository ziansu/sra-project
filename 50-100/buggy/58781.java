@java.lang.Override
public boolean onScale(android.view.ScaleGestureDetector detector) {
    mScaleXFactor *= detector.getScaleFactor();
    mScaleYFactor *= detector.getScaleFactor();
    mScaleXFactor = java.lang.Math.max(0.1F, java.lang.Math.min(mScaleXFactor, 10.0F));
    mScaleYFactor = java.lang.Math.max(0.1F, java.lang.Math.min(mScaleYFactor, 10.0F));
    setScaleX(mScaleXFactor);
    setScaleY(mScaleYFactor);
    android.util.Log.d("ScaleListener", ((("Scale factor , x  " + (mScaleXFactor)) + "  , y  ") + (mScaleYFactor)));
    return true;
}