@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    int parentWidth = com.habitrpg.android.habitica.ui.views.login.MeasureSpec.getSize(widthMeasureSpec);
    int parentHeight = com.habitrpg.android.habitica.ui.views.login.MeasureSpec.getSize(heightMeasureSpec);
    this.width = parentWidth;
    this.height = ((int) (parentHeight * (com.habitrpg.android.habitica.ui.views.login.LoginBackgroundView.SIZE_FACTOR)));
    this.setMeasuredDimension(width, height);
    params.width = width;
    params.height = height;
    this.setLayoutParams(params);
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
}