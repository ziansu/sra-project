@org.junit.Test
public void resolveMultipartFile() throws java.lang.Exception {
    java.lang.Object actual = resolver.resolveArgument(paramMultipartFile, null, webRequest, null);
    assertNotNull(actual);
    assertSame(multipartFile1, actual);
}