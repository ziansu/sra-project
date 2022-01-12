@org.junit.Test
public void shouldParseIntFromOneByteWithOffset() {
    byte[] bytes = new byte[]{ 1 , 2 , 3 , ((byte) (5)) , 0 , 0 , 0 };
    final int parseInt = pl.grzeslowski.jsupla.protocol.decoders.PrimitiveParser.parseUnsignedInt(bytes, 3);
    org.assertj.core.api.Assertions.assertThat(parseInt).isEqualTo(((java.lang.Integer.MIN_VALUE) + 5));
}