@java.lang.Override
protected com.fasterxml.jackson.dataformat.xml.JsonGenerator _createGenerator(com.fasterxml.jackson.dataformat.xml.ObjectWriteContext writeCtxt, com.fasterxml.jackson.core.io.IOContext ioCtxt, java.io.Writer out) throws java.io.IOException {
    return new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(writeCtxt, ioCtxt, writeCtxt.getGeneratorFeatures(_generatorFeatures), writeCtxt.getFormatWriteFeatures(_xmlGeneratorFeatures), _objectCodec, _createXmlWriter(out), _xmlPrettyPrinter(writeCtxt));
}