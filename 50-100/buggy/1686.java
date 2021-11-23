private org.exist.xquery.ExternalModule compileOrBorrowModule(java.lang.String prefix, java.lang.String namespaceURI, java.lang.String location, org.exist.xquery.Source source) throws org.exist.xquery.XPathException {
    final org.exist.xquery.ExternalModule module = compileModule(prefix, namespaceURI, location, source);
    setModule(module.getNamespaceURI(), module);
    declareModuleVars(module);
    return module;
}