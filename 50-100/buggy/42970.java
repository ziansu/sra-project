public void testFailureOnMultipleBindingAnnotations() {
    final java.lang.Integer testInt = 1024;
    java.lang.Object instance = new java.lang.Object() {
        @com.google.inject.testing.fieldbinder.Bind
        @com.google.inject.name.Named(value = "a")
        @com.google.inject.testing.fieldbinder.BoundFieldModuleTest.SomeBindingAnnotation
        private java.lang.Integer anInt = testInt;
    };
    com.google.inject.testing.fieldbinder.BoundFieldModule module = com.google.inject.testing.fieldbinder.BoundFieldModule.of(instance);
    try {
        com.google.inject.Guice.createInjector(module);
    } catch (com.google.inject.CreationException e) {
        com.google.inject.Asserts.assertContains(e.getMessage(), "More than one annotation is specified for this binding.");
    }
}