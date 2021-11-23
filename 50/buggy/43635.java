protected void configure() {
    com.google.inject.multibindings.Multibinder.newSetBinder(binder(), java.lang.String.class).addBinding().toInstance("A");
}