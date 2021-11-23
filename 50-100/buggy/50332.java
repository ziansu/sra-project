public static int getMinHeight(android.view.View v) {
    int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
    int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(com.softdesign.devintensive.utils.UIHelper.getScreenWidth(), View.MeasureSpec.AT_MOST);
    v.measure(widthMeasureSpec, heightMeasureSpec);
    return v.getMeasuredHeight();
}