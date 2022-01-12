public void testBindingSuperTypeAccessSubType() {
    final java.lang.Integer testValue = 1024;
    java.lang.Object instance = new java.lang.Object() {
        @com.google.inject.testing.fieldbinder.Bind(to = java.lang.Number.class)
        private java.lang.Integer anInt = testValue;
    };
    com.google.inject.testing.fieldbinder.BoundFieldModule module = com.google.inject.testing.fieldbinder.BoundFieldModule.of(instance);
    com.google.inject.Injector injector = com.google.inject.Guice.createInjector(module);
    try {
        injector.getInstance(java.lang.Integer.class);
    } catch (com.google.inject.ConfigurationException e) {
        com.google.inject.Asserts.assertContains(e.getMessage(), "Could not find a suitable constructor in java.lang.Integer");
    }
}