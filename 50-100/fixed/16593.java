@java.lang.Override
public void configure(com.google.inject.Binder binder) {
    super.configure(binder);
    com.google.inject.multibindings.Multibinder<de.wwu.md2.framework.generator.IPlatformGenerator> multiGenBinder = com.google.inject.multibindings.Multibinder.newSetBinder(binder, de.wwu.md2.framework.generator.IPlatformGenerator.class);
    multiGenBinder.addBinding().to(de.wwu.md2.framework.generator.android.wearable.AndroidWearableGenerator.class);
    binder.bind(java.lang.Boolean.class).annotatedWith(com.google.inject.name.Names.named("Debug MD2GeneratorUtil")).toInstance(true);
}