@java.lang.Override
protected java.lang.Object readRecord(java.lang.Object old, org.apache.avro.Schema expected, org.apache.avro.io.ResolvingDecoder in) throws java.io.IOException {
    com.google.protobuf.Message.Builder b = ((com.google.protobuf.Message.Builder) (super.readRecord(null, expected, in)));
    return b.build();
}