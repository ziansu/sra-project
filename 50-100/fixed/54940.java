public void write(java.io.OutputStream outputStream) throws java.io.IOException, javax.ws.rs.WebApplicationException {
    java.io.Writer writer = new java.io.OutputStreamWriter(outputStream, java.nio.charset.StandardCharsets.UTF_8);
    org.apache.tika.sax.BodyContentHandler body = new org.apache.tika.sax.BodyContentHandler(new org.apache.tika.sax.RichTextContentHandler(writer));
    org.apache.tika.server.resource.TikaResource.parse(parser, org.apache.tika.server.resource.TikaResource.LOG, info.getPath(), is, body, metadata, context);
}