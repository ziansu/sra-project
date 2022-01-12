public void checkInvalidType(java.lang.String typeName) throws org.eclipse.ocl.ParserException {
    for (net.menthor.tocl.parser.RefOntoUML.Element elem : umap.keySet()) {
        if (elem instanceof net.menthor.tocl.parser.RefOntoUML.NamedElement) {
            net.menthor.tocl.parser.RefOntoUML.NamedElement namedElem = ((net.menthor.tocl.parser.RefOntoUML.NamedElement) (elem));
            if ((namedElem.getName()) != null) {
                if (namedElem.getName().equals(typeName))
                    return ;
                
            }
        }
    }
    throw new org.eclipse.ocl.ParserException((("Unrecognized Variable: (" + typeName) + ")"));
}