private sosconnector.Parser.DomParser createDomFromSource(sosconnector.Parser.SourceParser sourceParser) {
    java.lang.String sourceFormGOV = sourceParser.getSourceFormGOV();
    return new sosconnector.Parser.DomParser(sourceFormGOV);
}