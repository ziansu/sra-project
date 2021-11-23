@java.lang.Override
public void onFaviconUpdated(org.chromium.chrome.browser.tab.Tab tab, android.graphics.Bitmap icon) {
    if ((((mLargestFavicon) == null) || ((icon.getWidth()) > (mLargestFavicon.getWidth()))) || ((icon.getHeight()) > (mLargestFavicon.getHeight()))) {
        mLargestFavicon = icon;
        updateTaskDescription();
    }
}