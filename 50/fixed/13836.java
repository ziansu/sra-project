public void checkNextDialog(java.lang.String key) {
    org.junit.Assert.assertEquals(key, zildo.fwk.ZUtils.listTail(dials()).key);
}