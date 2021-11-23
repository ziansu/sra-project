public java.lang.String asString() {
    java.lang.String ret;
    final int beginAt = buffer.position();
    final int size = buffer.getInt();
    if (size == (-1)) {
        ret = null;
    }else {
        ret = db.postgresql.async.serializers.SerializationContext.bufferToString(size, buffer);
    }
    soFar += (buffer.position()) - beginAt;
    return ret;
}