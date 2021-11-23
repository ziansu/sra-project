public void setNavIcon(@android.support.annotation.DrawableRes
int icon) {
    setNavigationIcon(icon);
    android.support.v7.widget.AppCompatImageButton navIcon = ((android.support.v7.widget.AppCompatImageButton) (getChildAt(1)));
    android.support.v7.widget.Toolbar.LayoutParams lp = ((io.mindjet.jetwidget.LayoutParams) (navIcon.getLayoutParams()));
    lp.gravity = (android.view.Gravity.START) | (android.view.Gravity.CENTER_VERTICAL);
    lp.width = ViewGroup.LayoutParams.WRAP_CONTENT;
    lp.height = ViewGroup.LayoutParams.MATCH_PARENT;
    navIcon.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    navIcon.setLayoutParams(lp);
}