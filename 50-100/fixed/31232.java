public static void showOrHideCartPayBar(boolean flag) {
    com.xgf.winecome.ui.activity.HomeActivity.mPayMenuRl.setVisibility(View.VISIBLE);
    if (flag && (com.xgf.winecome.ui.activity.HomeActivity.mTabHost.getCurrentTabTag().endsWith(com.xgf.winecome.ui.activity.HomeActivity.TAB_CART))) {
        com.xgf.winecome.ui.activity.HomeActivity.mMainPayMenuLl.setVisibility(View.GONE);
        com.xgf.winecome.ui.activity.HomeActivity.mCartPayMenuLl.setVisibility(View.VISIBLE);
    }else {
        com.xgf.winecome.ui.activity.HomeActivity.mCartPayMenuLl.setVisibility(View.GONE);
    }
}