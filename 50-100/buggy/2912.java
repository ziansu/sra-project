private com.ge.research.sadl.model.gp.NamedNode sadlTypeReferenceToNode(com.ge.research.sadl.sADL.SadlTypeReference rtype) throws com.ge.research.sadl.jena.JenaProcessorException {
    org.eclipse.emf.ecore.resource.Resource rtobj = sadlTypeReferenceToResource(rtype);
    if (rtobj == null) {
        throw new com.ge.research.sadl.jena.JenaProcessorException("SadlTypeReference was not resolved to a model resource.");
    }
    if (rtobj.isURIResource()) {
        com.ge.research.sadl.model.gp.NamedNode rtnn = new com.ge.research.sadl.model.gp.NamedNode(((org.eclipse.emf.ecore.resource.Resource) (rtobj)).getLocalName());
        rtnn.setNamespace(((org.eclipse.emf.ecore.resource.Resource) (rtobj)).getNameSpace());
        return rtnn;
    }else {
        throw new com.ge.research.sadl.jena.JenaProcessorException("SadlTypeReference is not a URI resource");
    }
}