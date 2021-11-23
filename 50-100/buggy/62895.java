private void setMainView() {
    android.view.ViewGroup.LayoutParams layoutParamsH = new android.view.ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, website.xiaoming.CenterSelectedSwipeLibrary.Util.dp2px(mContext, 100));
    setLayoutParams(layoutParamsH);
    setHorizontalScrollBarEnabled(false);
    setOverScrollMode(website.xiaoming.CenterSelectedSwipeLibrary.OVER_SCROLL_NEVER);
    linearLayout = new android.widget.LinearLayout(mContext);
    android.view.ViewGroup.LayoutParams layoutParamsV = new android.view.ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, website.xiaoming.CenterSelectedSwipeLibrary.Util.dp2px(mContext, 100));
    linearLayout.setGravity(Gravity.CENTER);
    linearLayout.setBackgroundColor(mBackGroundColor);
    linearLayout.setOrientation(LinearLayout.HORIZONTAL);
    addView(linearLayout, layoutParamsV);
}