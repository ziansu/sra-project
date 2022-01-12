@java.lang.Override
public void run() {
    android.widget.ImageView iv = new android.widget.ImageView(mContext);
    android.util.Log.d("--------->", "run: ");
    iv.setImageDrawable(mContext.getResources().getDrawable(mDot[1]));
    android.widget.FrameLayout.LayoutParams params = new android.widget.FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    params.leftMargin = ((int) (mDotGroup.getChildAt(0).getX()));
    params.gravity = android.view.Gravity.BOTTOM;
    mFrameLayout.addView(iv, params);
    mSelectedDot = mFrameLayout.getChildAt(1);
}