@org.junit.Test
public void testEventIsPublishedThroughoutHierarchy() throws java.lang.Exception {
    org.axonframework.commandhandling.model.inspection.AggregateModel<org.axonframework.commandhandling.model.ModelInspectorTest.SomeSubclass> inspector = org.axonframework.commandhandling.model.inspection.ModelInspector.inspectAggregate(org.axonframework.commandhandling.model.ModelInspectorTest.SomeSubclass.class);
    java.util.concurrent.atomic.AtomicLong payload = new java.util.concurrent.atomic.AtomicLong();
    inspector.publish(new org.axonframework.eventhandling.GenericEventMessage(payload), new org.axonframework.commandhandling.model.ModelInspectorTest.SomeSubclass());
    assertEquals(2L, payload.get());
}