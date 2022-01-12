public T decodeJson(java.lang.String data, T reuse) throws java.io.IOException {
    jsonDecoder = org.apache.avro.io.DecoderFactory.get().jsonDecoder(this.schema, data);
    return avroReader.read(null, jsonDecoder);
}