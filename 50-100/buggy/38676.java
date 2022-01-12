protected void parseObject() throws java.io.IOException, org.eclipse.rdf4j.rio.RDFHandlerException, org.eclipse.rdf4j.rio.RDFParseException {
    int c = peekCodePoint();
    if (c == '(') {
        object = parseCollection();
    }else
        if (c == '[') {
            object = parseImplicitBlank();
        }else {
            object = parseValue();
        }
    
    reportStatement(subject, predicate, object);
}