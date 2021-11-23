@org.junit.Test
public void removeBatchShouldReturn() throws java.lang.Exception {
    com.constructor.client.ConstructorIO constructor = new com.constructor.client.ConstructorIO("YSOxV00F0Kk2R0KnPQN8", "ZqXaOfXuBWD4s3XzCI1q", true, null);
    org.junit.Assert.assertTrue("batch removal succeeds", constructor.removeBatch(new java.lang.String[]{ this.getRandString() , this.getRandString() , this.getRandString() }, "Search Suggestions"));
}