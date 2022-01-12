public int getInt(java.lang.Object p, int def) {
    int v = def;
    if (isResource()) {
        com.epimorphics.rdfutil.RDFNodeWrapper n = getPropertyValue(p);
        if ((n != null) && (n.isLiteral())) {
            try {
                v = n.asLiteral().getInt();
                java.lang.System.err.println((">> v := " + v));
            } catch (org.apache.jena.datatypes.DatatypeFormatException e) {
            }
        }
    }
    return v;
}