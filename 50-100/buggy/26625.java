@android.test.suitebuilder.annotation.SmallTest
@android.test.UiThreadTest
public void testMessageButtons() {
    assertNotNull(tester.draftButtons[1]);
    draftButtons[1].performClick();
    assertNotNull(tester.draftButtons[2]);
    draftButtons[2].performClick();
    assertEquals("The draftsDatabase now only contains 1 message", 1, messagesToBeDisplayed.size());
    assertNotNull(tester.draftButtons[0]);
    draftButtons[0].performClick();
    assertNull(draftsDatabase);
}