public java.lang.Boolean getByteBoolOrNull(final int pos) throws java.sql.SQLException {
    final java.lang.Byte b = getByteOrNull(pos);
    return b == null ? null : new java.lang.Boolean((1 == (b.byteValue())));
}