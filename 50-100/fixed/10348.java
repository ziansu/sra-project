protected static org.olap4j.mdx.IdentifierNode getIdentifier(java.lang.String... identifiers) {
    java.lang.String identifier = "";
    for (int i = 0; i < (identifiers.length); i++) {
        if (i == 0) {
            identifier = "~" + (identifiers[0]);
        }else {
            identifier += "_" + (identifiers[i]);
        }
    }
    return org.olap4j.mdx.IdentifierNode.ofNames(identifier);
}