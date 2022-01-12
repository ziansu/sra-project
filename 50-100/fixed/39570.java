public void write(java.io.OutputStream outputStream) throws java.io.IOException, javax.ws.rs.WebApplicationException {
    java.io.Writer writer = new java.io.OutputStreamWriter(outputStream, java.nio.charset.StandardCharsets.UTF_8);
    org.xml.sax.ContentHandler handler = new org.apache.tika.parser.html.BoilerpipeContentHandler(writer);
    org.apache.tika.server.resource.TikaResource.parse(parser, org.apache.tika.server.resource.TikaResource.LOG, info.getPath(), is, handler, metadata, context);
}