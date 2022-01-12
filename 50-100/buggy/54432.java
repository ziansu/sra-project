private void advanceToNextTokenFromNonArrayElement(com.hazelcast.nio.serialization.FieldDefinition fd, java.lang.String token) throws java.io.IOException {
    int pos = readPositionFromMetadata(fd);
    in.position(pos);
    boolean isNull = in.readBoolean();
    if (isNull) {
        throw new java.lang.NullPointerException(("Parent field is null: " + token));
    }
    int factoryId = in.readInt();
    int classId = in.readInt();
    int version = in.readInt();
    advance(factoryId, classId, version);
}