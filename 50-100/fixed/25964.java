@org.junit.Test
public void shouldParseMinIntFromFullInt() {
    byte[] bytes = new byte[]{ ((byte) (0)) , ((byte) (0)) , ((byte) (0)) , ((byte) (0)) };
    final long parseInt = pl.grzeslowski.jsupla.protocol.decoders.PrimitiveParser.parseUnsignedInt(bytes, 0);
    org.assertj.core.api.Assertions.assertThat(parseInt).isEqualTo(java.lang.Integer.MIN_VALUE);
}