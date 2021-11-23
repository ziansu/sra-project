@java.lang.Override
public boolean onScale(android.view.ScaleGestureDetector detector) {
    mScaleXFactor *= detector.getScaleFactor();
    mScaleYFactor *= detector.getScaleFactor();
    setScaleX(mScaleXFactor);
    setScaleY(mScaleYFactor);
    android.util.Log.d("ScaleListener", ((("Scale factor , x  " + (mScaleXFactor)) + "  , y  ") + (mScaleYFactor)));
    return true;
}