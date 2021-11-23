@org.chromium.base.test.util.DisabledTest
public void testSelectActionBarInputPaste() throws java.lang.Exception {
    copyStringToClipboard("SampleTextToCopy");
    org.chromium.content.browser.test.util.DOMUtils.longPressNode(this, mContentViewCore, "input_text");
    waitForSelectActionBarVisible(true);
    assertTrue(mContentViewCore.hasSelection());
    assertNotNull(mContentViewCore.getSelectActionHandler());
    selectActionBarPaste();
    org.chromium.content.browser.test.util.DOMUtils.clickNode(this, mContentViewCore, "plain_text_1");
    org.chromium.content.browser.test.util.DOMUtils.longPressNode(this, mContentViewCore, "input_text");
    waitForSelectActionBarVisible(true);
    assertTrue(mContentViewCore.hasSelection());
    assertEquals(mContentViewCore.getSelectedText(), "SampleTextToCopy");
}