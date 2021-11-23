@org.junit.Test
public void testFileContents() throws com.kloudless.exception.KloudlessException, java.io.IOException {
    com.kloudless.net.KloudlessResponse response = com.kloudless.model.File.contents("fL3N1cHBvcnQtc2FsZXNmb3JjZS5wbmc=", "4", null);
    java.lang.String contents = response.getResponseBody();
    java.lang.System.out.println(contents);
}