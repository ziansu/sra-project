protected static org.olap4j.mdx.IdentifierNode getIdentifier(org.saiku.query.AbstractQuerySet... identifiers) {
    java.lang.String identifier = "";
    for (int i = 0; i < (identifiers.length); i++) {
        if (i == 0) {
            identifier = "~" + (identifiers[0].getName());
        }else {
            identifier += "_" + (identifiers[i].getName());
        }
    }
    return org.olap4j.mdx.IdentifierNode.ofNames(identifier);
}