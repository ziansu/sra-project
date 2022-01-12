private void initialization() {
    mHeaderLayout = new com.handler.HeaderLayout(this);
    mHeaderLayout.setHeaderIITII(R.drawable.icon_arrow_back_white, HeaderLayout.RES_NONE, HeaderLayout.RES_NONE, R.drawable.icon_search, R.drawable.icon_menu_white);
    mHeaderLayout.setListener(this, this, this, this);
    mBottomRl = ((android.widget.LinearLayout) (findViewById(R.id.bottom_ll)));
    android.view.View searchIv = findViewById(R.id.right_extra_ib);
    searchIv.setClickable(true);
    viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.plan_vp)));
}