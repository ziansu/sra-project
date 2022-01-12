@org.junit.Test
public void shouldParseMaxIntFromFullInt() {
    byte[] bytes = new byte[]{ ((byte) (-1)) , ((byte) (-1)) , ((byte) (-1)) , ((byte) (-1)) };
    final long parseInt = pl.grzeslowski.jsupla.protocol.decoders.PrimitiveParser.parseUnsignedInt(bytes, 0);
    org.assertj.core.api.Assertions.assertThat(parseInt).isEqualTo(java.lang.Integer.MAX_VALUE);
}