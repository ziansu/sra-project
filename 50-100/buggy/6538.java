@java.lang.Override
public void onGlobalLayout() {
    int mProceedTextHeight = mProceed.getHeight();
    android.util.Log.v("Proceed Text Height", (mProceedTextHeight + ""));
    int imagegridHeight = imagegrid.getHeight();
    android.util.Log.v("ImageGridHeight", (imagegridHeight + ""));
    android.view.ViewGroup.LayoutParams layoutParams = imagegrid.getLayoutParams();
    layoutParams.height = imagegridHeight - mProceedTextHeight;
    imagegrid.setLayoutParams(layoutParams);
    mProceed.getViewTreeObserver().removeGlobalOnLayoutListener(this);
}