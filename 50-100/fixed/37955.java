@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    this.width = com.habitrpg.android.habitica.ui.views.login.MeasureSpec.getSize(widthMeasureSpec);
    this.setMeasuredDimension(width, height);
    params.width = width;
    params.height = height;
    this.setLayoutParams(params);
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
}