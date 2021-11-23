private void updateRefreshViewMarginTop(int moveHeight) {
    moveHeight = (moveHeight < 0) ? 0 : moveHeight;
    int marginTop = ((moveHeight - (maxRefreshViewHeight)) < 0) ? moveHeight - (maxRefreshViewHeight) : 0;
    com.echo.common.view.LayoutParams layoutParams = ((com.echo.common.view.LayoutParams) (refreshView.getLayoutParams()));
    layoutParams.topMargin = marginTop;
    refreshView.setLayoutParams(layoutParams);
    android.util.Log.e("jyj", ("topMargin" + marginTop));
    pullIconView.invalidate();
}