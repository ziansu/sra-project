protected void configure() {
    final com.google.inject.multibindings.Multibinder<java.lang.String> multibinder = com.google.inject.multibindings.Multibinder.newSetBinder(binder(), java.lang.String.class);
    multibinder.addBinding().toInstance("A");
    multibinder.addBinding().toInstance("A");
}