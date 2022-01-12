@org.junit.Test
public void test() {
    org.junit.Assert.assertEquals(2, numDecodings("12"));
    org.junit.Assert.assertEquals(2, numDecodings("26"));
    org.junit.Assert.assertEquals(0, numDecodings("0"));
    org.junit.Assert.assertEquals(1, numDecodings("10"));
    org.junit.Assert.assertEquals(0, numDecodings("100"));
}