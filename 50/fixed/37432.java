@java.lang.Override
protected void beforeHandleAddedSubjects() {
    getRelationshipNamespaceAssigner().allocateConcreteDomainModules(new java.util.HashSet<java.lang.String>(newPropertiesMultiMap.keySet()), context);
}