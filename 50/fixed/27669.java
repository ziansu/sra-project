@org.junit.Test
public void givenAuthor_shouldReturnAuthor() throws java.lang.Exception {
    authorWrapper = new com.bikesandwheels.annotations.wrappers.AuthorWrapper(createAuthor("John"));
    org.junit.Assert.assertThat(authorWrapper.getName(), org.hamcrest.Matchers.is("John"));
}