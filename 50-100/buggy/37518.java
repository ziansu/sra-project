@java.lang.SuppressWarnings(value = "unused")
public static java.lang.invoke.CallSite bsm_newBackSpecies(java.lang.invoke.MethodHandles.Lookup lookup, java.lang.String name, java.lang.invoke.MethodType type, java.lang.String owner, java.lang.String genericName) throws java.lang.Throwable {
    java.lang.Class<?> frontClass = java.lang.ClassLoader.getSystemClassLoader().loadClass(owner);
    return new java.lang.invoke.ConstantCallSite(rt.RT.createBackSpecies(lookup, type, frontClass, genericName));
}