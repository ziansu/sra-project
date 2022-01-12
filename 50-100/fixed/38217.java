public static void mergeDelimitedFrom(com.google.protobuf.Message.Builder builder, java.io.InputStream in) throws java.io.IOException {
    final int firstByte = in.read();
    if (firstByte != (-1)) {
        final int size = com.google.protobuf.CodedInputStream.readRawVarint32(firstByte, in);
        final java.io.InputStream limitedInput = new org.apache.hadoop.hbase.io.LimitInputStream(in, size);
        final com.google.protobuf.CodedInputStream codedInput = com.google.protobuf.CodedInputStream.newInstance(limitedInput);
        codedInput.setSizeLimit(size);
        builder.mergeFrom(codedInput);
        codedInput.checkLastTagWas(0);
    }
}