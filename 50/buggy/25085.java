private void log(java.lang.String msg) {
    java.lang.String format = "pos[%s], pages[%s] %s";
    java.lang.String text = java.lang.String.format(format, mPosition, com.shopgun.android.sdk.pageflip.utils.PageflipUtils.join(",", mPages), msg);
    com.shopgun.android.sdk.log.SgnLog.d(com.shopgun.android.sdk.pageflip.CatalogPageFragment.TAG, text);
}