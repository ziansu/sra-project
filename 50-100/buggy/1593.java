@org.junit.Test
public void testNAK() throws java.lang.Exception {
    com.whizzosoftware.wzwave.codec.ZWaveFrameDecoder decoder = new com.whizzosoftware.wzwave.codec.ZWaveFrameDecoder();
    java.util.List<java.lang.Object> out = new java.util.ArrayList<java.lang.Object>();
    io.netty.buffer.ByteBuf in = wrappedBuffer(new byte[]{ 21 });
    decoder.decode(null, in, out);
    org.junit.Assert.assertEquals(1, out.size());
    assertTrue(((out.get(0)) instanceof com.whizzosoftware.wzwave.codec.NAK));
}