@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    android.util.Log.d("CoverFlowView", "onDraw");
    final float offset = mOffset;
    if ((offset - ((int) (offset))) == 0.0F) {
        int top = getActuallyPosition(((int) (offset)));
        if (top != (lastViewOnTopIndex)) {
            lastViewOnTopIndex = top;
            if ((mViewOnTopListener) != null)
                mViewOnTopListener.viewOnTop(top, getTopView());
            
        }
    }
    super.onDraw(canvas);
}