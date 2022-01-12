public static void debugClass(java.lang.Class<?> _class, int flags) {
    java.lang.Class<?> rootClass = Utils.getRootClass(_class);
    DebugUtils.dbgClasses.put(_class, rootClass);
    DebugUtils.dbgClassFlags.put(rootClass, new DebugUtils.DebugFlags(DebugUtils.dbgClassFlags.get(rootClass), flags));
}