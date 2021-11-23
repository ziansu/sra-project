@org.junit.Test
public void test_FILE_selectRequestType() {
    java.lang.System.out.println("test_FILE_selectRequestType");
    java.lang.String[] pathTokens = "/db/mybucket.files/123".split("/");
    org.junit.Assert.assertEquals(RequestContext.TYPE.FILE, org.restheart.handlers.RequestContext.selectRequestType(pathTokens));
    pathTokens = "/db/mybucket.files/123/binary".split("/");
    org.junit.Assert.assertEquals(RequestContext.TYPE.FILE, org.restheart.handlers.RequestContext.selectRequestType(pathTokens));
    pathTokens = "/db/mybucket.files/123/456".split("/");
    org.junit.Assert.assertEquals(RequestContext.TYPE.FILE, org.restheart.handlers.RequestContext.selectRequestType(pathTokens));
}