public org.sbml.jsbml.SBMLDocument readSBMLFile(java.lang.String fileName) throws java.io.IOException, javax.xml.stream.XMLStreamException {
    java.io.File file = new java.io.File(fileName);
    java.lang.System.out.println(file.getAbsolutePath());
    return readSBML(new java.io.File(fileName));
}