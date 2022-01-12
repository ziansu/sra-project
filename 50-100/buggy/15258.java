@android.test.suitebuilder.annotation.SmallTest
@org.chromium.base.test.util.Feature(value = { "OnDocumentLoadedInFrame" })
public void testOnDocumentLoadedInFrame() throws java.lang.Throwable {
    java.lang.String path = "/test.html";
    java.lang.String pageContent = org.xwalk.core.xwview.test.util.CommonResources.makeHtmlPageFrom("<title>Test</title>", "<div> The title is: Test </div>");
    final java.lang.String url = addPageToTestServer(mWebServer, path, pageContent);
    loadUrlSync(url);
    assertEquals(1, mOnDocumentLoadedInFrameHelper.getFrameId());
    assertEquals(1, mOnDocumentLoadedInFrameHelper.getCallCount());
}