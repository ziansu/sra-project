@java.lang.Override
public void onGlobalLayout() {
    int mProceedTextHeight = mProceed.getHeight();
    android.util.Log.v("Proceed Text Height", (mProceedTextHeight + ""));
    int imagegridHeight = imagegrid.getHeight();
    android.util.Log.v("ImageGridHeight", (imagegridHeight + ""));
    mProceed.getViewTreeObserver().removeGlobalOnLayoutListener(this);
}