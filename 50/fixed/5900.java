private sosconnector.Parser.DomParser createDomFromSource(sosconnector.Parser.SourceParser sourceParser) {
    java.lang.String sourceFormGOV = sourceParser.getSourceFormGOV();
    if (sourceFormGOV.isEmpty())
        return null;
    
    return new sosconnector.Parser.DomParser(sourceFormGOV);
}