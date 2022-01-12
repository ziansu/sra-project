protected void configure() {
    bind(com.google.inject.JitBindingsTest.Foo.class).to(com.google.inject.JitBindingsTest.FooImpl.class);
    install(new com.google.inject.PrivateModule() {
        public void configure() {
            binder().requireExplicitBindings();
            bind(com.google.inject.JitBindingsTest.FooBar.class);
            expose(com.google.inject.JitBindingsTest.FooBar.class);
        }
    });
}