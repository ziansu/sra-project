public void testSetGetAccessibleDescription() {
    java.lang.String description = "componentDescription";
    context.setAccessibleDescription(description);
    assertEquals(javax.accessibility.AccessibleContext.ACCESSIBLE_DESCRIPTION_PROPERTY, propertyChangeListener.lastEvent.getPropertyName());
    assertEquals(description, propertyChangeListener.lastEvent.getNewValue());
    assertEquals(description, context.getAccessibleDescription());
    assertEquals(description, context.accessibleDescription);
}