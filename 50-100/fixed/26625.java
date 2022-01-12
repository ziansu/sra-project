@android.test.suitebuilder.annotation.SmallTest
@android.test.UiThreadTest
public void testMessageButtons() {
    assertNotNull(tester.draftButtons[0]);
    tester.draftButtons[0].performClick();
    assertNotNull(tester.draftButtons[1]);
    tester.draftButtons[1].performClick();
    assertEquals("The draftsDatabase now only contains 1 message", 1, messagesToBeDisplayed.size());
    assertNotNull(tester.draftButtons[0]);
    tester.draftButtons[0].performClick();
    assertNull(draftsDatabase);
}