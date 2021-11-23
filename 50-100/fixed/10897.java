private void assertBitSet(int... bits) {
    java.util.BitSet expected = new java.util.BitSet(bits.length);
    for (int i = 0; i < (bits.length); i++) {
        if ((bits[i]) != 0) {
            expected.set(i);
        }
    }
    org.fest.assertions.api.Assertions.assertThat(bitEncoding.bitSet()).isEqualTo(expected);
}