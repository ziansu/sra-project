public void testCreateLinkForWebUiNullText() {
    mockUnconnectableStoryboard();
    replayMocks();
    com.googlesource.gerrit.plugins.its.storyboard.StoryboardItsFacade itsFacade = createStoryboardItsFacade();
    java.lang.String actual = itsFacade.createLinkForWebui("Test-Url", null);
    assertEquals("Test-Url", actual);
}