protected char[] getResourceContent(org.rascalmpl.value.ISourceLocation location) throws java.io.IOException {
    char[] data;
    java.io.Reader textStream = null;
    org.rascalmpl.uri.URIResolverRegistry resolverRegistry = org.rascalmpl.uri.URIResolverRegistry.getInstance();
    try {
        textStream = resolverRegistry.getCharacterReader(location);
        data = org.rascalmpl.parser.gtd.io.InputConverter.toChar(textStream);
    } finally {
        if (textStream != null) {
            textStream.close();
        }
    }
    return data;
}