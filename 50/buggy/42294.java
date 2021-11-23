@java.lang.Override
protected void configure() {
    bind(com.google.inject.JitBindingsTest.Foo.class).to(com.google.inject.JitBindingsTest.FooImpl.class);
}