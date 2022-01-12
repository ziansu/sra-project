@java.lang.Override
public void showFinishOperation(com.liferay.mobile.screens.assetlist.AssetEntry assetEntry) {
    com.liferay.mobile.screens.assetdisplay.AssetDisplayFactory factory = new com.liferay.mobile.screens.assetdisplay.AssetDisplayFactory();
    com.liferay.mobile.screens.base.BaseScreenlet screenlet = factory.getScreenlet(getContext(), assetEntry);
    if (screenlet != null) {
        addView(screenlet, LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    }else {
        com.liferay.mobile.screens.util.LiferayLogger.e("Error loading screenlet");
    }
}