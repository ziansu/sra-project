public static org.structr.core.node.search.SearchAttribute andExactRelType(final org.structr.core.entity.NamedRelation namedRelation) {
    return org.structr.core.node.search.Search.andExactRelType(namedRelation.getRelType().name(), namedRelation.getSourceType(), namedRelation.getDestType());
}