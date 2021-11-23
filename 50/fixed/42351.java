@org.junit.Test
public void testWillThrowExceptionWhenImageIsNullAndFileWasNotCreated() {
    expectedEx.expect(java.lang.IllegalArgumentException.class);
    tletters.imagegeneration.ImageGenerator generator = new tletters.imagegeneration.ImageGenerator();
    generator.saveGeneratedImage();
}