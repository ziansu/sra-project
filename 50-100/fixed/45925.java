private void testFailingWithEmptyProperties(final org.everit.osgi.ecm.component.ri.ComponentContainerInstance<org.everit.osgi.ecm.component.tests.FailingComponent> container) {
    java.util.Hashtable<java.lang.String, java.lang.Object> properties = new java.util.Hashtable<java.lang.String, java.lang.Object>();
    updateConfiguration(container, properties);
    waitForTrueSupplied(() -> (getComponentState(container)) == (org.everit.osgi.ecm.component.resource.ComponentState.ACTIVE));
    org.junit.Assert.assertEquals(1, container.getResources().length);
}