@org.junit.Test
public void testParseInfoRequest() throws java.lang.Exception {
    rosa.iiif.image.model.InfoRequest info;
    rosa.iiif.image.model.InfoRequest test;
    info = new rosa.iiif.image.model.InfoRequest();
    info.setImageId("abc/123");
    info.setFormat(InfoFormat.JSON);
    test = parser.parseImageInfoRequest("/abc%2F123/info.json");
    org.junit.Assert.assertEquals(info, test);
}