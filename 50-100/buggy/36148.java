public org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode<?, ?> normalizedNodeFromJsonString(final java.lang.String inputJson) {
    final org.opendaylight.yangtools.yang.data.impl.schema.NormalizedNodeResult result = new org.opendaylight.yangtools.yang.data.impl.schema.NormalizedNodeResult();
    final org.opendaylight.yangtools.yang.data.api.schema.stream.NormalizedNodeStreamWriter streamWriter = org.opendaylight.yangtools.yang.data.impl.schema.ImmutableNormalizedNodeStreamWriter.from(result);
    final org.opendaylight.yangtools.yang.data.codec.gson.JsonParserStream jsonParser = org.opendaylight.yangtools.yang.data.codec.gson.JsonParserStream.create(streamWriter, context);
    jsonParser.parse(new com.google.gson.stream.JsonReader(new java.io.StringReader(inputJson)));
    final org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode<?, ?> transformedInput = result.getResult();
    return transformedInput;
}