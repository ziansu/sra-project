public void configure() {
    bind(com.google.inject.JitBindingsTest.Foo.class).to(com.google.inject.JitBindingsTest.FooImpl.class);
    expose(com.google.inject.JitBindingsTest.Foo.class);
    bind(com.google.inject.JitBindingsTest.FooImpl.class);
}