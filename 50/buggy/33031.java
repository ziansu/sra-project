public java.lang.Boolean getByteBoolOrNull(final int pos) throws java.sql.SQLException {
    final java.lang.Byte b = getByteOrNull(pos);
    if (b == null)
        return null;
    else
        return new java.lang.Boolean((1 == (b.byteValue())));
    
}