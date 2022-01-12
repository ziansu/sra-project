public void testMultipleErrorsAreAggregated() {
    java.lang.Object instance = new java.lang.Object() {
        @com.google.inject.testing.fieldbinder.Bind
        private com.google.inject.Provider aProvider;

        @com.google.inject.testing.fieldbinder.Bind(to = java.lang.String.class)
        private java.lang.Integer anInt;
    };
    com.google.inject.testing.fieldbinder.BoundFieldModule module = com.google.inject.testing.fieldbinder.BoundFieldModule.of(instance);
    try {
        com.google.inject.Guice.createInjector(module);
        fail();
    } catch (com.google.inject.CreationException e) {
        assertEquals(2, e.getErrorMessages().size());
    }
}