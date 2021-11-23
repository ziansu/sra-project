@java.lang.Override
public org.apache.jena.graph.Node get1(org.apache.jena.sparql.core.Var var) {
    try {
        org.rdfhdt.hdtjena.bindings.HDTId id = idBinding.get(var);
        if (id == null)
            return null;
        
        org.apache.jena.graph.Node n = id.getNode();
        if (n == null) {
            n = id.getDictionary().getNode(id);
            id.setNode(n);
        }
        return n;
    } catch (java.lang.Exception ex) {
        org.apache.jena.atlas.logging.Log.fatal(this, java.lang.String.format("get1(%s)", var), ex);
        return null;
    }
}