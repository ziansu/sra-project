public com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator createGenerator(com.fasterxml.jackson.dataformat.xml.ObjectWriteContext writeCtxt, javax.xml.stream.XMLStreamWriter sw) throws java.io.IOException {
    sw = _initializeXmlWriter(sw);
    com.fasterxml.jackson.core.io.IOContext ioCtxt = _createContext(sw, false);
    return new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(writeCtxt, ioCtxt, writeCtxt.getGeneratorFeatures(_generatorFeatures), writeCtxt.getFormatWriteFeatures(_xmlGeneratorFeatures), sw, _xmlPrettyPrinter(writeCtxt));
}