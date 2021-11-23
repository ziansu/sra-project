@org.junit.Test
public void testMultiply() throws java.lang.Exception, java.lang.NullPointerException {
    java.io.File file = new java.io.File("/Users/shafidayatar/Desktop/Gash-EnterpriseApp-275/sturdy-happiness/build_pb_shafi.sh");
    java.util.ArrayList<com.google.protobuf.ByteString> chunks = WriteFileTest.mc.chunkFile(file);
    for (int i = 1; i <= 1000; i++) {
        gash.router.client.CommConnection.getInstance().enqueue(WriteFileTest.mc.buildWCommandMessage(("build_pb_shafi_" + i), chunks));
    }
    java.lang.Thread.sleep(10000);
}