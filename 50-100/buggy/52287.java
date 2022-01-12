@org.junit.Test
public void shouldParseIntFromOneByte() {
    byte[] bytes = new byte[]{ ((byte) (5)) , 0 , 0 , 0 };
    final int parseInt = pl.grzeslowski.jsupla.protocol.decoders.PrimitiveParser.parseUnsignedInt(bytes, 0);
    org.assertj.core.api.Assertions.assertThat(parseInt).isEqualTo(((java.lang.Integer.MIN_VALUE) + 5));
}