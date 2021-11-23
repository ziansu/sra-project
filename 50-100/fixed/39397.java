@org.junit.Test
public void signalFileNotFoundToUserInterface() {
    java.lang.String path = org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(13);
    org.mockito.Mockito.when(fileLoader.load(path)).thenReturn(ZStory.NOT_FOUND);
    memory.initialize(path);
    org.mockito.Mockito.verify(userInterface).fatal((("Story file '" + path) + "' not found."));
}