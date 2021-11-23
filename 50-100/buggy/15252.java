public soot.javaToJimple.IInitialResolver.Dependencies resolveFromFile(java.io.File file, java.lang.String className, soot.SootClass sc) {
    soot.dexpler.DexlibWrapper wrapper = cache.get(file);
    if (wrapper == null) {
        wrapper = new soot.dexpler.DexlibWrapper(file);
        cache.put(file, wrapper);
        wrapper.initialize();
    }
    soot.javaToJimple.IInitialResolver.Dependencies deps = wrapper.makeSootClass(sc, className);
    soot.dexpler.DexResolver.addSourceFileTag(sc, file.getAbsolutePath());
    return deps;
}