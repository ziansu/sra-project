public java.lang.Object asObject() {
    final int beginAt = buffer.position();
    final java.lang.Object ret = db.postgresql.async.messages.DataRow.extractByPgType(rowDescription.field(index), buffer);
    soFar += (buffer.position()) - beginAt;
    return ret;
}