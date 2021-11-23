public static final void nextAll(com.bladecoder.ink.runtime.Story story, java.util.List<java.lang.String> text) throws com.bladecoder.ink.runtime.StoryException, java.lang.Exception {
    while (story.canContinue()) {
        java.lang.String line = story.Continue();
        java.lang.System.out.print(line);
        text.add(line.trim());
    } 
    if (story.hasError()) {
        org.junit.Assert.fail(com.bladecoder.ink.runtime.test.TestUtils.joinText(story.getCurrentErrors()));
    }
}