public void parse(java.io.InputStream inputStream, java.lang.String encoding) throws java.io.IOException {
    java.lang.String markup;
    if (encoding != null)
        markup = org.apache.wicket.util.io.Streams.readString(inputStream, encoding);
    else
        markup = org.apache.wicket.util.io.Streams.readString(inputStream);
    
    java.lang.String compressed = compressor.compress(markup);
    byte[] bytes;
    if (encoding != null)
        bytes = compressed.getBytes(encoding);
    else
        bytes = compressed.getBytes();
    
    delegate.parse(new java.io.ByteArrayInputStream(bytes), encoding);
}