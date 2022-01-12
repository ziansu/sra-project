public static void add(java.lang.String namespace, java.lang.String key, java.lang.String value) {
    if (((namespace != null) && (key != null)) && (value != null)) {
        edu.brown.cs.systems.baggage.BaggageContents.add(com.google.protobuf.ByteString.copyFromUtf8(namespace), com.google.protobuf.ByteString.copyFromUtf8(key), com.google.protobuf.ByteString.copyFromUtf8(value));
    }
}