public static java.lang.String MessageGenerate(com.upokecenter.test.Message msg) {
    if (msg == null) {
        org.junit.Assert.fail();
    }
    java.lang.String ret = msg.Generate();
    org.junit.Assert.assertEquals(2, com.upokecenter.test.EncodingTest.IsGoodAsciiMessageFormat(ret, false, ""));
    return ret;
}