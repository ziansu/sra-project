public void createEntity(java.lang.String entityId, java.lang.String name) throws java.lang.Exception {
    assertUndeclared(entityId);
    declaredVariables.put(entityId, name);
}