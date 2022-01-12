@org.junit.Test
public void testDefault() throws java.io.IOException {
    com.cilogi.ds.guide.Config config = new com.cilogi.ds.guide.Config();
    java.lang.String out = config.toJSONString();
    com.cilogi.ds.guide.Config back = com.cilogi.ds.guide.Config.fromJSON(out);
    org.junit.Assert.assertEquals(config, back);
    org.junit.Assert.assertTrue(config.isShared());
}