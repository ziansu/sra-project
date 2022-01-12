private void setSheetOffsetFromBottom(float offset) {
    if (org.chromium.chrome.browser.util.MathUtils.areFloatsEqual(offset, getSheetOffsetFromBottom()))
        return ;
    
    if (offset > (getMinOffset())) {
        onSheetOpened();
    }else {
        onSheetClosed();
    }
    setTranslationY(((mContainerHeight) - offset));
    sendOffsetChangeEvents();
}