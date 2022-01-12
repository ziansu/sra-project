public static void showOrhHideMainPayBar(boolean flag) {
    com.xgf.winecome.ui.activity.HomeActivity.mPayMenuRl.setVisibility(View.VISIBLE);
    if (flag && (com.xgf.winecome.ui.activity.HomeActivity.mTabHost.getCurrentTabTag().endsWith(com.xgf.winecome.ui.activity.HomeActivity.TAB_MAIN))) {
        com.xgf.winecome.ui.activity.HomeActivity.mMainPayMenuLl.setVisibility(View.VISIBLE);
        com.xgf.winecome.ui.activity.HomeActivity.mCartPayMenuLl.setVisibility(View.GONE);
    }else {
        com.xgf.winecome.ui.activity.HomeActivity.mMainPayMenuLl.setVisibility(View.GONE);
    }
}