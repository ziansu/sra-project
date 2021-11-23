private static java.util.List<org.openrdf.model.Value> asList(java.lang.reflect.AccessibleObject theAccess, java.util.Collection<java.lang.Object> theCollection) throws com.clarkparsia.empire.annotation.InvalidRdfException {
    try {
        return com.google.common.collect.Lists.newArrayList(com.google.common.collect.Collections2.transform(theCollection, new com.clarkparsia.empire.annotation.RdfGenerator.AsValueFunction(theAccess)));
    } catch (java.lang.RuntimeException e) {
        throw new com.clarkparsia.empire.annotation.InvalidRdfException(e.getMessage());
    }
}