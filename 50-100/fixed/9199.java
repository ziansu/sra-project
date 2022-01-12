@java.lang.Override
public java.lang.String qnameFor(java.lang.String uri) {
    int split = org.apache.jena.rdf.model.impl.Util.splitNamespaceXML(uri);
    java.lang.String ns = uri.substring(0, split);
    java.lang.String local = uri.substring(split);
    if (local.equals(""))
        return null;
    
    java.lang.String prefix = getNsURIPrefix(ns);
    return prefix == null ? null : (prefix + ":") + local;
}