private java.lang.Class<?>[] clazz(java.lang.Object... args) {
    java.lang.Class<?>[] clazz = new java.lang.Class[args.length];
    for (int index = 0; index < (clazz.length); index++) {
        java.lang.Object arg = args[index];
        clazz[index] = (com.kepler.generic.wrap.GenericArg.class.isAssignableFrom(arg.getClass())) ? com.kepler.generic.wrap.GenericArg.class : arg.getClass();
    }
    return clazz;
}