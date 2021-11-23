@org.junit.Test
@org.chromium.base.test.util.Feature(value = { "OfflinePages" })
public void testOpenItemByGuid() {
    org.chromium.chrome.browser.offlinepages.downloads.OfflinePageDownloadItem item = createDownloadItem1();
    org.mockito.Mockito.doReturn("").when(mBridge).nativeGetOfflineUrlByGuid(org.mockito.Mockito.anyLong(), org.mockito.Mockito.eq(item.getGuid()));
    mBridge.openItem(item.getGuid());
    org.mockito.Mockito.verify(mBridge, org.mockito.Mockito.times(1)).nativeGetOfflineUrlByGuid(org.mockito.Mockito.eq(0L), org.mockito.Mockito.eq(item.getGuid()));
}