void initialize(java.lang.String storyFilePath) {
    com.zaxsoft.zax.zmachine.ZStory story = fileLoader.load(storyFilePath);
    if (story == (ZStory.NOT_FOUND)) {
        userInterface.fatal((("Story file '" + storyFilePath) + "' not found."));
    }else {
        data = story.getStory();
        dataLength = story.getStory().length;
    }
}