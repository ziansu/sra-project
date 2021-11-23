public void testSetGetAccessibleName() {
    java.lang.String name = "componentName";
    context.setAccessibleName(name);
    assertEquals(javax.accessibility.AccessibleContext.ACCESSIBLE_NAME_PROPERTY, propertyChangeListener.lastEvent.getPropertyName());
    assertEquals(name, propertyChangeListener.lastEvent.getNewValue());
    assertEquals(name, context.getAccessibleName());
    assertEquals(name, context.accessibleName);
}