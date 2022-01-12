@org.m2ci.msp.jtgt.io.Test(dataProvider = "textGrids")
public void testLoadingTextGridWithoutException(java.lang.String testResourceName) throws org.m2ci.msp.jtgt.io.TextGridIOException {
    java.io.InputStream input = this.getClass().getResourceAsStream(testResourceName);
    java.lang.String string_tg = new java.util.Scanner(input, "UTF-8").useDelimiter("\\A").next();
    org.m2ci.msp.jtgt.io.TextGridSerializer tgs = new org.m2ci.msp.jtgt.io.TextGridSerializer();
    org.m2ci.msp.jtgt.TextGrid tg = tgs.fromString(string_tg);
}