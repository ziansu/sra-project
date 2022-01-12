public void testSetGetAccessibleParent() {
    javax.accessibility.Accessible parent = new javax.accessibility.Accessible() {
        private java.lang.String name = "parentName";

        public javax.accessibility.AccessibleContext getAccessibleContext() {
            return null;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return name;
        }
    };
    context.setAccessibleParent(parent);
    assertEquals(parent, context.getAccessibleParent());
    assertEquals(parent, context.accessibleParent);
    assertNull(propertyChangeListener.lastEvent);
}