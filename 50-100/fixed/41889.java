@org.testng.annotations.Test
public void testPrepareHtmlImgSrc() {
    java.lang.String source = "source";
    org.mockito.Mockito.when(base64.encodeB64Bytes(org.mockito.Matchers.<byte[]>any())).thenReturn(source);
    java.lang.String actual = imageUtils.prepareHtmlImgSrc(originalImageByteArray);
    org.testng.Assert.assertEquals(actual, source);
}