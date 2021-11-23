@android.test.suitebuilder.annotation.SmallTest
public void testDeleteOfflinePage() throws java.lang.Exception {
    deletePage(org.chromium.chrome.browser.offlinepages.OfflinePageBridgeTest.BOOKMARK_ID, DeletePageResult.SUCCESS);
    loadUrl(mTestPage);
    savePage(SavePageResult.SUCCESS, mTestPage);
    assertNotNull("Offline page should be available, but it is not.", getPageByClientId(org.chromium.chrome.browser.offlinepages.OfflinePageBridgeTest.BOOKMARK_ID));
    deletePage(org.chromium.chrome.browser.offlinepages.OfflinePageBridgeTest.BOOKMARK_ID, DeletePageResult.SUCCESS);
    assertNull("Offline page should be gone, but it is available.", getPageByClientId(org.chromium.chrome.browser.offlinepages.OfflinePageBridgeTest.BOOKMARK_ID));
}