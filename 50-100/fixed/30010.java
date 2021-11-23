@android.test.suitebuilder.annotation.SmallTest
@org.chromium.base.test.util.Feature(value = { "TextInput" })
public void testSelectActionBarInputPaste() throws java.lang.Exception {
    copyStringToClipboard("SampleTextToCopy");
    org.chromium.content.browser.test.util.DOMUtils.longPressNode(this, mContentViewCore, "input_text");
    waitForSelectActionBarVisible(true);
    assertTrue(mContentViewCore.hasSelection());
    assertNotNull(mContentViewCore.getSelectActionHandler());
    selectActionBarPaste();
    org.chromium.content.browser.test.util.DOMUtils.longPressNode(this, mContentViewCore, "input_text");
    waitForSelectActionBarVisible(true);
    assertTrue(mContentViewCore.hasSelection());
    assertEquals(mContentViewCore.getSelectedText(), "SampleTextToCopy");
}