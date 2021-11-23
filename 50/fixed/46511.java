@org.junit.Test
public void imageDirectoriesAreCorrectlyUpdated() {
    ash.java.photo.IoUtils.updateImageDirectories(IoUtilsUnitTests.props);
    org.hamcrest.MatcherAssert.assertThat(checkDirectoriesContainSameFilenames(TEST_FULLSIZE_FOLDER, TEST_THUMBNAIL_FOLDER), is(true));
}