public java.lang.Object asArray(final java.lang.Class elementType) {
    final db.postgresql.async.messages.FieldDescriptor fd = rowDescription.field(index);
    final db.postgresql.async.pginfo.PgType pgType = registry.pgType(fd.getTypeOid());
    final int beginAt = buffer.position();
    final java.lang.Object ret = pgType.read(buffer, fd.getTypeOid(), elementType);
    soFar += (buffer.position()) - beginAt;
    finishField();
    return ret;
}