public org.sbml.jsbml.SBMLDocument readSBMLFile(java.lang.String fileName) throws java.io.IOException, javax.xml.stream.XMLStreamException {
    return readSBML(new java.io.File(fileName));
}