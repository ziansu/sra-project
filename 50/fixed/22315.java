@java.lang.Override
public void onResume() {
    super.onResume();
    mPageflip.setPageflipListener(new com.shopgun.android.sdk.demo.PageflipListenerPrinter(com.shopgun.android.sdk.demo.CatalogViewerActivity.TAG, true));
}