private java.lang.String getNodeRDFID(org.ndexbio.model.object.network.Node node) {
    org.ndexbio.model.object.network.BaseTerm bTerm = network.getBaseTerms().get(node.getRepresents());
    org.ndexbio.model.object.network.Namespace ns = network.getNamespaces().get(bTerm.getNamespaceId());
    if ((ns.getUri()) == null)
        return bTerm.getName();
    
    return (ns.getUri()) + (bTerm.getName());
}