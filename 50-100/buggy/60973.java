void initialize(com.zaxsoft.zax.zmachine.ZUserInterface zUserInterface, java.lang.String storyFilePath) {
    userInterface = zUserInterface;
    com.zaxsoft.zax.zmachine.ZStory story = fileLoader.load(storyFilePath);
    if (story == (ZStory.NOT_FOUND)) {
        userInterface.fatal((("Story file '" + storyFilePath) + "' not found."));
    }else {
        data = story.getStory();
        dataLength = story.getStory().length;
    }
}