public org.eclipse.uml2.uml.Element GetElement(java.lang.String name) {
    for (net.menthor.ontouml2uml.RefOntoUML.Element elem : umap.keySet()) {
        if (elem instanceof net.menthor.ontouml2uml.RefOntoUML.NamedElement) {
            net.menthor.ontouml2uml.RefOntoUML.NamedElement nElem = ((net.menthor.ontouml2uml.RefOntoUML.NamedElement) (elem));
            if ((nElem.getName()) != null) {
                if (nElem.getName().equals(name))
                    return umap.get(nElem);
                
            }
        }
    }
    return null;
}