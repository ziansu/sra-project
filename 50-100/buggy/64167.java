private static void appendNestedPath(java.lang.StringBuffer sb, org.apache.jena.rdf.model.Resource path, java.lang.String separator) {
    if (path.isURIResource()) {
        sb.append(org.apache.jena.sparql.util.FmtUtils.stringForNode(path.asNode(), path.getModel()));
    }else {
        org.topbraid.shacl.arq.SHACLPaths.appendPathBlankNode(sb, path, org.topbraid.shacl.arq.SHACLPaths.SEQUENCE_PATH_SEPARATOR);
    }
}