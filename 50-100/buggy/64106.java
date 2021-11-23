private void validateType(com.hazelcast.internal.serialization.impl.PortablePosition position, com.hazelcast.nio.serialization.FieldType expectedType) {
    com.hazelcast.nio.serialization.FieldType returnedType = position.getType();
    if ((position.getIndex()) >= 0) {
        returnedType = returnedType.getSingleType();
    }
    if (expectedType != returnedType) {
        throw new java.lang.IllegalArgumentException((((("Wrong type read! Actual:" + (returnedType.name())) + " Expected: ") + (expectedType.name())) + ". Did you you a correct read method? E.g. readInt() for int."));
    }
}