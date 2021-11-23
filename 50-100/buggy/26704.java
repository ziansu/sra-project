public static void loadMapping(net.md_5.specialsource.JarMapping mapping) throws java.lang.IllegalArgumentException {
    if ((com.maxqia.ReflectionRemapper.Transformer.jarMapping) != null)
        throw new java.lang.IllegalArgumentException("Already loaded a mapping");
    
    com.maxqia.ReflectionRemapper.Transformer.jarMapping = mapping;
    net.md_5.specialsource.provider.JointProvider provider = new net.md_5.specialsource.provider.JointProvider();
    provider.add(new com.maxqia.ReflectionRemapper.ClassInheritanceProvider());
    provider.add(new net.md_5.specialsource.provider.ClassLoaderProvider(RemappedMethods.loader));
    com.maxqia.ReflectionRemapper.Transformer.jarMapping.setFallbackInheritanceProvider(provider);
    com.maxqia.ReflectionRemapper.Transformer.remapper = new net.md_5.specialsource.JarRemapper(mapping);
}