@java.lang.Override
protected void beforeHandleAddedSubjects() {
    getRelationshipNamespaceAssigner().allocateConcreteDomainModules(newPropertiesMultiMap.keySet(), context);
}