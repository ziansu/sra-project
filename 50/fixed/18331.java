@java.lang.Override
protected void configure() {
    binder().requireExplicitBindings();
    bind(com.google.inject.JitBindingsTest.Foo.class).to(com.google.inject.JitBindingsTest.FooImpl.class);
    bind(com.google.inject.JitBindingsTest.FooImpl.class);
}