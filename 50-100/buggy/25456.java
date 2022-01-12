public void testClassIsPrintedInErrorsWhenCauseIsSuperclass() {
    java.lang.Object instance = new com.google.inject.testing.fieldbinder.BoundFieldModuleTest.InvalidBindableSubclass();
    com.google.inject.testing.fieldbinder.BoundFieldModule module = com.google.inject.testing.fieldbinder.BoundFieldModule.of(instance);
    try {
        com.google.inject.Guice.createInjector(module);
    } catch (com.google.inject.CreationException e) {
        com.google.inject.Asserts.assertContains(e.getMessage(), ("Requested binding type \"java.lang.String\" is not assignable from field binding type " + "\"java.lang.Integer\""));
    }
}