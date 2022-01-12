void addNamespaceBinding(uk.ac.ncl.intbio.core.datatree.Datatree.NamespaceBinding namespaceBinding) throws org.sbolstandard.core2.SBOLValidationException {
    if (((!(namespaceBinding.getNamespaceURI().endsWith("#"))) && (!(namespaceBinding.getNamespaceURI().endsWith(":")))) && (!(namespaceBinding.getNamespaceURI().endsWith("/")))) {
        throw new org.sbolstandard.core2.SBOLValidationException("sbol-10105");
    }
    nameSpaces.put(namespaceBinding.getNamespaceURI(), namespaceBinding);
}