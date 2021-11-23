@org.junit.Test
public void shouldParseIntFromOneByteWithOffset() {
    byte[] bytes = new byte[]{ 1 , 2 , 3 , ((byte) (5)) , 0 , 0 , 0 };
    final long parseInt = pl.grzeslowski.jsupla.protocol.decoders.PrimitiveParser.parseUnsignedInt(bytes, 3);
    org.assertj.core.api.Assertions.assertThat(parseInt).isEqualTo(5);
}